package typingsJapgolly.blueTape

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.tape.anon.FnCall
import typingsJapgolly.tape.mod.StreamOptions
import typingsJapgolly.tape.mod.TestCase
import typingsJapgolly.tape.mod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Create a new test with an optional name string and optional opts object.
    * cb(t) fires with the new test object t once all preceeding tests have finished.
    * Tests execute serially.
    */
  inline def apply(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("blue-tape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHarness(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createHarness")().asInstanceOf[FnCall]
  
  inline def createStream(): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[ReadableStream]
  inline def createStream(opts: StreamOptions): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def onFailure(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFailure")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onFinish(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinish")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def only(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def only(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def skip(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def skip(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
