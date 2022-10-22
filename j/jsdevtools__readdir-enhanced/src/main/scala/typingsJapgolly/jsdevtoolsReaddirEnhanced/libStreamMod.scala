package typingsJapgolly.jsdevtoolsReaddirEnhanced

import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStreamMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdirStream(dir: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatstrue): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
}
