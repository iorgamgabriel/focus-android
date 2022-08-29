/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package org.mozilla.focus.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

/**
 * Custom Focus dimensions
 */
data class FocusDimensions(
    val onboardingTitle: TextUnit,
    val onboardingSubtitleOne: TextUnit,
    val onboardingSubtitleTwo: TextUnit,
    val onboardingStartBrowsingWidth: Dp,
    val onboardingStartBrowsingHeight: Dp,
    val onboardingFeaturesPaddingBottom: Dp,
    val onboardingFeatureDescriptionWidth: Dp
)
