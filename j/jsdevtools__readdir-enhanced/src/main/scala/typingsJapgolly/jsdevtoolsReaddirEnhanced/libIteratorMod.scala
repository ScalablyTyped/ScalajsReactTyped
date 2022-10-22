package typingsJapgolly.jsdevtoolsReaddirEnhanced

import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsJapgolly.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Stats
import typingsJapgolly.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIteratorMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdirIterator(dir: String): AsyncIterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Stats]]
}
