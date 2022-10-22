package typingsJapgolly.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesCommandNameMod {
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("react-native-navigation/lib/dist/src/interfaces/CommandName", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommandName & String] = js.native
    
    @js.native
    sealed trait DismissAllModals
      extends StObject
         with CommandName
    /* "dismissAllModals" */ val DismissAllModals: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissAllModals & String = js.native
    
    @js.native
    sealed trait DismissAllOverlays
      extends StObject
         with CommandName
    /* "dismissAllOverlays" */ val DismissAllOverlays: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissAllOverlays & String = js.native
    
    @js.native
    sealed trait DismissModal
      extends StObject
         with CommandName
    /* "dismissModal" */ val DismissModal: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissModal & String = js.native
    
    @js.native
    sealed trait DismissOverlay
      extends StObject
         with CommandName
    /* "dismissOverlay" */ val DismissOverlay: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.DismissOverlay & String = js.native
    
    @js.native
    sealed trait GetLaunchArgs
      extends StObject
         with CommandName
    /* "getLaunchArgs" */ val GetLaunchArgs: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.GetLaunchArgs & String = js.native
    
    @js.native
    sealed trait MergeOptions
      extends StObject
         with CommandName
    /* "mergeOptions" */ val MergeOptions: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.MergeOptions & String = js.native
    
    @js.native
    sealed trait Pop
      extends StObject
         with CommandName
    /* "pop" */ val Pop: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.Pop & String = js.native
    
    @js.native
    sealed trait PopTo
      extends StObject
         with CommandName
    /* "popTo" */ val PopTo: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.PopTo & String = js.native
    
    @js.native
    sealed trait PopToRoot
      extends StObject
         with CommandName
    /* "popToRoot" */ val PopToRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.PopToRoot & String = js.native
    
    @js.native
    sealed trait Push
      extends StObject
         with CommandName
    /* "push" */ val Push: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.Push & String = js.native
    
    @js.native
    sealed trait SetDefaultOptions
      extends StObject
         with CommandName
    /* "setDefaultOptions" */ val SetDefaultOptions: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetDefaultOptions & String = js.native
    
    @js.native
    sealed trait SetRoot
      extends StObject
         with CommandName
    /* "setRoot" */ val SetRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetRoot & String = js.native
    
    @js.native
    sealed trait SetStackRoot
      extends StObject
         with CommandName
    /* "setStackRoot" */ val SetStackRoot: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.SetStackRoot & String = js.native
    
    @js.native
    sealed trait ShowModal
      extends StObject
         with CommandName
    /* "showModal" */ val ShowModal: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.ShowModal & String = js.native
    
    @js.native
    sealed trait ShowOverlay
      extends StObject
         with CommandName
    /* "showOverlay" */ val ShowOverlay: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.ShowOverlay & String = js.native
    
    @js.native
    sealed trait UpdateProps
      extends StObject
         with CommandName
    /* "updateProps" */ val UpdateProps: typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName.UpdateProps & String = js.native
  }
}
