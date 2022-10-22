package typingsJapgolly.puppeteerCore.libCjsPuppeteerTypesMod

import org.scalajs.dom.Node
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ElementHandle")
@js.native
open class ElementHandle[ElementType /* <: Node */] protected ()
  extends typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject,
    frame: typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
  ) = this()
}
