package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.PickPropsstylechildrenvis
import typingsJapgolly.reactNativePaper.anon.ScrollArea
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDialogDialogMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Dialog/Dialog", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Content of the `Dialog`.
      */
    var children: Node
    
    /**
      * Determines whether clicking outside the dialog dismiss it.
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user dismisses the dialog.
      */
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Determines Whether the dialog is visible.
      */
    var visible: Boolean
  }
  object Props {
    
    inline def apply(theme: Theme, visible: Boolean): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDialogDialogMod.foo` */
  override def _to: ComponentType[PickPropsstylechildrenvis] & (NonReactStatics[ComponentType[Props] & ScrollArea, js.Object]) = default
}
