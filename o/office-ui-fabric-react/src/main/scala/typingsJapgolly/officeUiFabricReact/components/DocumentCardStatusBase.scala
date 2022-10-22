package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardStatusDottypesMod.IDocumentCardStatus
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardStatusDottypesMod.IDocumentCardStatusProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardStatusDottypesMod.IDocumentCardStatusStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardStatusDottypesMod.IDocumentCardStatusStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardStatusBase {
  
  inline def apply(status: String): Builder = {
    val __props = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardStatusProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardStatus.base", "DocumentCardStatusBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardStatusDotbaseMod.DocumentCardStatusBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardStatus]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardStatus | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardStatus | Null) => value(t0).runNow()))
    
    inline def statusIcon(value: String): this.type = set("statusIcon", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardStatusStyleProps => DeepPartial[IDocumentCardStatusStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardStatusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
