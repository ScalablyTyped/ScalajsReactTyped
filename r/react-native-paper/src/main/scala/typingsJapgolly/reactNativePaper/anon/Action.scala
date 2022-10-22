package typingsJapgolly.reactNativePaper.anon

import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.libTypescriptComponentsAppbarAppbarHeaderMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var Action: DisplayName
  
  var BackAction: CallHasAccessibilityLabelRest
  
  var Content: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[(ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallDisplayName, js.Object])
  
  var Header: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityElementsHidden | PickthemeDeepPartialThemeAccessibilityHint
  ]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object])
}
object Action {
  
  inline def apply(
    Action: DisplayName,
    BackAction: CallHasAccessibilityLabelRest,
    Content: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[(ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallDisplayName, js.Object]),
    Header: (ComponentType[
      PickthemeDeepPartialThemeAccessibilityElementsHidden | PickthemeDeepPartialThemeAccessibilityHint
    ]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object])
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BackAction = BackAction.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: DisplayName): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBackAction(value: CallHasAccessibilityLabelRest): Self = StObject.set(x, "BackAction", value.asInstanceOf[js.Any])
    
    inline def setContent(
      value: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[(ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallDisplayName, js.Object])
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setHeader(
      value: (ComponentType[
          PickthemeDeepPartialThemeAccessibilityElementsHidden | PickthemeDeepPartialThemeAccessibilityHint
        ]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object])
    ): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
  }
}
