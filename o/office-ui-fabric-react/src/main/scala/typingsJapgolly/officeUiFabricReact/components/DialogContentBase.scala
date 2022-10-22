package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContent
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentStyles
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogContentBase {
  
  @JSImport("office-ui-fabric-react", "DialogContentBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.DialogContentBase] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDialogContent]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDialogContent | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDialogContent | Null) => value(t0).runNow()))
    
    inline def draggableHeaderClassName(value: String): this.type = set("draggableHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def isMultiline(value: Boolean): this.type = set("isMultiline", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => Any): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    inline def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDialogContentStyleProps => DeepPartial[IDialogContentStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def subText(value: String): this.type = set("subText", value.asInstanceOf[js.Any])
    
    inline def subTextId(value: String): this.type = set("subTextId", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String | Element): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleId(value: String): this.type = set("titleId", value.asInstanceOf[js.Any])
    
    inline def titleProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("titleProps", value.asInstanceOf[js.Any])
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def topButtonsProps(value: js.Array[IButtonProps]): this.type = set("topButtonsProps", value.asInstanceOf[js.Any])
    
    inline def topButtonsPropsVarargs(value: IButtonProps*): this.type = set("topButtonsProps", js.Array(value*))
    
    inline def `type`(value: DialogType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DialogContentBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
