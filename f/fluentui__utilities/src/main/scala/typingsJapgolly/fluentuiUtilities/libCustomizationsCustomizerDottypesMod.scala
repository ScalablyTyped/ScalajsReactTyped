package typingsJapgolly.fluentuiUtilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.fluentuiUtilities.anon.ReadonlyICustomizerContex
import typingsJapgolly.fluentuiUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.fluentuiUtilities.libCustomizationsCustomizationsMod.ISettings
import typingsJapgolly.fluentuiUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import typingsJapgolly.fluentuiUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCustomizationsCustomizerDottypesMod {
  
  /* Inlined @fluentui/utilities.@fluentui/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings :@fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettings | @fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings :@fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettings | @fluentui/utilities.@fluentui/utilities/lib/customizations/Customizations.ISettingsFunction}> & {  children :react.react.ReactNode | undefined,   contextTransform :(context : std.Readonly<@fluentui/utilities.@fluentui/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @fluentui/utilities.@fluentui/utilities/lib/customizations/CustomizerContext.ICustomizerContext | undefined} */
  trait ICustomizerProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[Any]] = js.undefined
    
    /**
      * Optional transform function for context. Any implementations should take care to return context without
      * mutating it.
      */
    var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.undefined
    
    var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
    
    var settings: js.UndefOr[ISettings | ISettingsFunction] = js.undefined
  }
  object ICustomizerProps {
    
    inline def apply(): ICustomizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomizerProps]
    }
    
    extension [Self <: ICustomizerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: IRefObject[Any]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ Any | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ Any | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): Self = StObject.set(x, "contextTransform", js.Any.fromFunction1(value))
      
      inline def setContextTransformUndefined: Self = StObject.set(x, "contextTransform", js.undefined)
      
      inline def setScopedSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "scopedSettings", value.asInstanceOf[js.Any])
      
      inline def setScopedSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "scopedSettings", js.Any.fromFunction1(value))
      
      inline def setScopedSettingsUndefined: Self = StObject.set(x, "scopedSettings", js.undefined)
      
      inline def setSettings(value: ISettings | ISettingsFunction): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
