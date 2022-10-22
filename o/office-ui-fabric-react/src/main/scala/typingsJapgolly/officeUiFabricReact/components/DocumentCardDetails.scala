package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardDetailsDottypesMod.IDocumentCardDetails
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardDetailsDottypesMod.IDocumentCardDetailsProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardDetailsDottypesMod.IDocumentCardDetailsStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardDetailsDottypesMod.IDocumentCardDetailsStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardDetails {
  
  @JSImport("office-ui-fabric-react", "DocumentCardDetails")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardDetails]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardDetails | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardDetails | Null) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardDetailsStyleProps => DeepPartial[IDocumentCardDetailsStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DocumentCardDetails.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDocumentCardDetailsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
