package typingsJapgolly.musicmetadata

import typingsJapgolly.musicmetadata.MM.Metadata
import typingsJapgolly.musicmetadata.MM.Options
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(readStream: Readable, callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].apply(readStream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  inline def apply(
    readStream: Readable,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]
  ): EventEmitter = (^.asInstanceOf[js.Dynamic].apply(readStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  @JSImport("musicmetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
