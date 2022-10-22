package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDottypesMod.IDocumentCardActions
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDottypesMod.IDocumentCardActionsProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDottypesMod.IDocumentCardActionsStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDottypesMod.IDocumentCardActionsStyles
import typingsJapgolly.std.Number
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardActions {
  
  inline def apply(actions: js.Array[IButtonProps]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardActionsProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DocumentCardActions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDotbaseMod.DocumentCardActionsBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardActions]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardActions | Null) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def views(value: Number): this.type = set("views", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
