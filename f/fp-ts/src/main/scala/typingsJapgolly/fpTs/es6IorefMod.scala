package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libIOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6IorefMod {
  
  @JSImport("fp-ts/es6/IORef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/IORef", "IORef")
  @js.native
  open class IORef[A] protected ()
    extends typingsJapgolly.fpTs.libIorefMod.IORef[A] {
    def this(value: A) = this()
  }
  
  inline def newIORef[A](a: A): IO_[typingsJapgolly.fpTs.libIorefMod.IORef[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("newIORef")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[typingsJapgolly.fpTs.libIorefMod.IORef[A]]]
}
