package typingsJapgolly.cassandraDriver.libTypesMod.types

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultStream extends Readable {
  
  def add(chunk: Buffer): Unit = js.native
  
  var buffer: Buffer = js.native
  
  var paused: Boolean = js.native
}
