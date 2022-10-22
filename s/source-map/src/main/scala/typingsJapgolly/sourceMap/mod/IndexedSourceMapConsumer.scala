package typingsJapgolly.sourceMap.mod

import typingsJapgolly.sourceMap.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedSourceMapConsumer
  extends StObject
     with SourceMapConsumer {
  
  var sources: js.Array[String] = js.native
}
object IndexedSourceMapConsumer {
  
  inline def apply: IndexedSourceMapConsumerConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("IndexedSourceMapConsumer").asInstanceOf[IndexedSourceMapConsumerConstructor]
}
