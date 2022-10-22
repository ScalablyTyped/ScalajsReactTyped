package typingsJapgolly.rcImage.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcImage.anon.Close
import typingsJapgolly.rcImage.libPreviewGroupMod.PreviewGroupPreview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_GroupConsumerProps_44527066 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def icons(value: Close): this.type = set("icons", value.asInstanceOf[js.Any])
  
  inline def preview(value: Boolean | PreviewGroupPreview): this.type = set("preview", value.asInstanceOf[js.Any])
  
  inline def previewPrefixCls(value: String): this.type = set("previewPrefixCls", value.asInstanceOf[js.Any])
}
