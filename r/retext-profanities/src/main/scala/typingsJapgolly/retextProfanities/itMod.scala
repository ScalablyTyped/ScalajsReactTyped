package typingsJapgolly.retextProfanities

import typingsJapgolly.nlcst.mod.Root
import typingsJapgolly.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itMod {
  
  @JSImport("retext-profanities/it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[Root, Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[Root, Root])]
  inline def default(options: typingsJapgolly.retextProfanities.factoryMod.Options): Unit | (Transformer[Root, Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[Root, Root])]
  
  type Options = typingsJapgolly.retextProfanities.factoryMod.Options
}
