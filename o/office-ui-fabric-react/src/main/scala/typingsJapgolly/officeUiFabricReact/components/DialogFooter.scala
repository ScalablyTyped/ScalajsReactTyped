package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogFooterDottypesMod.IDialogFooter
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogFooterDottypesMod.IDialogFooterProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogFooterDottypesMod.IDialogFooterStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDialogDialogFooterDottypesMod.IDialogFooterStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogFooter {
  
  @JSImport("office-ui-fabric-react", "DialogFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDialogFooter]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDialogFooter | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDialogFooter | Null) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDialogFooterStyleProps, IDialogFooterStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDialogFooterStyleProps => DeepPartial[IDialogFooterStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DialogFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
