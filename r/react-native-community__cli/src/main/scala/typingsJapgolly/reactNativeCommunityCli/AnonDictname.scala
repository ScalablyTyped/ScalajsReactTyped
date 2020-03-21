package typingsJapgolly.reactNativeCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typingsJapgolly.reactNativeCommunityCli.mod.DependencyConfigIOS
import typingsJapgolly.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typingsJapgolly.reactNativeCommunityCli.mod.PlatformConfig
import typingsJapgolly.reactNativeCommunityCli.mod.ProjectConfigAndroid
import typingsJapgolly.reactNativeCommunityCli.mod.ProjectConfigIOS
import typingsJapgolly.reactNativeCommunityCli.mod.ProjectParamsAndroid
import typingsJapgolly.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.undefined
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.undefined
}

object AnonDictname {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[PlatformConfig[_, _, _, _]] = null,
    android: PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ] = null,
    ios: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS] = null
  ): AnonDictname = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictname]
  }
}

