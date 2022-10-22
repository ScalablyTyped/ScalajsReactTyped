package typingsJapgolly.rehypeRaw

import typingsJapgolly.hastUtilRaw.libMod.Node
import typingsJapgolly.hastUtilRaw.libMod.VFile
import typingsJapgolly.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rehype-raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root])]
  inline def default(options: typingsJapgolly.hastUtilRaw.libMod.Options): Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.hast.mod.Root, typingsJapgolly.hast.mod.Root])]
  
  @js.native
  trait DoNotTouchAsThisImportIncludesRawInTree extends StObject {
    
    def raw(tree: Node): Node = js.native
    def raw(tree: Node, file: Unit, options: typingsJapgolly.hastUtilRaw.libMod.Options): Node = js.native
    def raw(tree: Node, file: VFile): Node = js.native
    def raw(tree: Node, file: VFile, options: typingsJapgolly.hastUtilRaw.libMod.Options): Node = js.native
    def raw(tree: Node, options: typingsJapgolly.hastUtilRaw.libMod.Options): Node = js.native
  }
  
  type Options = typingsJapgolly.hastUtilRaw.mod.Options
  
  type Root = typingsJapgolly.hast.mod.Root
}
