package typingsJapgolly.remarkGfm

import typingsJapgolly.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-gfm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: Options): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  
  trait Options
    extends StObject
       with typingsJapgolly.micromarkExtensionGfmStrikethrough.devLibSyntaxMod.Options
       with typingsJapgolly.mdastUtilGfmTable.libMod.Options
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Root = typingsJapgolly.mdast.mod.Root
}
