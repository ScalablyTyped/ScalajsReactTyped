package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
open class SkipUntilSourceObserver protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}
/* static members */
object SkipUntilSourceObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    prevObserver: IObserver,
    skipUntilStream: typingsJapgolly.wonderFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): typingsJapgolly.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(prevObserver.asInstanceOf[js.Any], skipUntilStream.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver]
}
