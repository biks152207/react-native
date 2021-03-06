/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.devsupport.interfaces;

import com.facebook.react.bridge.NativeDeltaClient;
import javax.annotation.Nullable;

public interface DevBundleDownloadListener {
  void onSuccess(@Nullable NativeDeltaClient nativeDeltaClient);
  void onProgress(@Nullable String status, @Nullable Integer done, @Nullable Integer total);
  void onFailure(Exception cause);
}
