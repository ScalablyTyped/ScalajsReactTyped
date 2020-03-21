package typingsJapgolly.duplexify.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplexifyConstructor
  extends Instantiable0[Duplexify]
     with Instantiable1[/* writable */ Writable, Duplexify]
     with Instantiable2[/* writable */ Writable, /* readable */ Readable, Duplexify]
     with Instantiable3[
      /* writable */ Writable, 
      /* readable */ Readable, 
      /* streamOptions */ DuplexOptions, 
      Duplexify
    ] {
  def apply(): Duplexify = js.native
  def apply(writable: Writable): Duplexify = js.native
  def apply(writable: Writable, readable: Readable): Duplexify = js.native
  def apply(writable: Writable, readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
  def obj(): Duplexify = js.native
  def obj(writable: Writable): Duplexify = js.native
  def obj(writable: Writable, readable: Readable): Duplexify = js.native
  def obj(writable: Writable, readable: Readable, streamOptions: DuplexOptions): Duplexify = js.native
}

