package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.constantsMod.NavigationConstants
import typingsJapgolly.reactNativeNavigation.navigationMod.NavigationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactNativeNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typingsJapgolly.reactNativeNavigation.constantsMod.Constants
  
  val Navigation: NavigationRoot = js.native
  /* static members */
  @js.native
  object Constants extends js.Object {
    var instance: js.Any = js.native
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popOver" */ val popOver: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popOver with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle with String
      ] = js.native
  }
  
}

