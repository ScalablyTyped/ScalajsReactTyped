package typingsJapgolly.fontCarrier

import typingsJapgolly.fontCarrier.classFontMod.FileOptions
import typingsJapgolly.fontCarrier.classFontMod.FontOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("font-carrier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** 一个 font 对象就表示解析后的字体对象，包含字体所有的信息 */
  @JSImport("font-carrier", "Font")
  @js.native
  open class Font ()
    extends typingsJapgolly.fontCarrier.classFontMod.^
  
  /** fontface 对象包含了字体的一些特殊相关信息 */
  @JSImport("font-carrier", "FontFace")
  @js.native
  open class FontFace ()
    extends typingsJapgolly.fontCarrier.classFontfaceMod.^
  
  /** glyph 字形对象代表了具体某个字的信息 */
  @JSImport("font-carrier", "Glyph")
  @js.native
  open class Glyph ()
    extends typingsJapgolly.fontCarrier.classGlyphMod.^
  
  inline def create(): typingsJapgolly.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
  inline def create(options: FileOptions): typingsJapgolly.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
  
  inline def transfer(path: String): typingsJapgolly.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
  inline def transfer(path: String, options: FontOptions): typingsJapgolly.fontCarrier.classFontMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
  inline def transfer(path: Buffer): typingsJapgolly.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
  inline def transfer(path: Buffer, options: FontOptions): typingsJapgolly.fontCarrier.classFontMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fontCarrier.classFontMod.^]
}
