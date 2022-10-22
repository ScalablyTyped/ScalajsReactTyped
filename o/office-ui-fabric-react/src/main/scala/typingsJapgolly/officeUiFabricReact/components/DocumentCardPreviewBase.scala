package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDottypesMod.IDocumentCardPreview
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDottypesMod.IDocumentCardPreviewImage
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDottypesMod.IDocumentCardPreviewProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDottypesMod.IDocumentCardPreviewStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDottypesMod.IDocumentCardPreviewStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardPreviewBase {
  
  inline def apply(previewImages: js.Array[IDocumentCardPreviewImage]): Builder = {
    val __props = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardPreviewProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.base", "DocumentCardPreviewBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardPreviewDotbaseMod.DocumentCardPreviewBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardPreview]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardPreview | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardPreview | Null) => value(t0).runNow()))
    
    inline def getOverflowDocumentCountText(value: /* overflowCount */ Double => String): this.type = set("getOverflowDocumentCountText", js.Any.fromFunction1(value))
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardPreviewStyleProps => DeepPartial[IDocumentCardPreviewStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardPreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
