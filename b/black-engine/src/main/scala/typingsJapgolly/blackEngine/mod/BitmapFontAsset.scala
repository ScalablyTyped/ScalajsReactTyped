package typingsJapgolly.blackEngine.mod

import org.scalajs.dom.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "BitmapFontAsset")
@js.native
open class BitmapFontAsset protected ()
  extends typingsJapgolly.blackEngine.assetsBitmapFontAssetMod.BitmapFontAsset {
  def this(name: String, imageUrl: String, xmlUrl: String) = this()
}
/* static members */
object BitmapFontAsset {
  
  @JSImport("black-engine", "BitmapFontAsset")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(xml: Document, texture: typingsJapgolly.blackEngine.texturesTextureMod.Texture): typingsJapgolly.blackEngine.assetsBitmapFontAssetMod.BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.assetsBitmapFontAssetMod.BitmapFontData]
}
