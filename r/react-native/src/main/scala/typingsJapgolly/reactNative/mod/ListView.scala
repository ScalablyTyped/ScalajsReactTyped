package typingsJapgolly.reactNative.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.anon.AnimatedX
import typingsJapgolly.reactNative.anon.ContentLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native", "ListView")
@js.native
open class ListView ()
  extends Component[ListViewProps, js.Object, Any] {
  
  /**
    * Exports some data, e.g. for perf investigations or analytics.
    */
  def getMetrics(): ContentLength = js.native
  
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): Any = js.native
  
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    *
    * See `ScrollView#scrollTo`.
    */
  def scrollTo(): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Double, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Double): Unit = js.native
  def scrollTo(y: Unit, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: AnimatedX): Unit = js.native
  def scrollTo(y: AnimatedX, x: Double): Unit = js.native
  def scrollTo(y: AnimatedX, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: AnimatedX, x: Unit, animated: Boolean): Unit = js.native
}
/* static members */
object ListView {
  
  @JSImport("react-native", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "ListView.DataSource")
  @js.native
  def DataSource: ListViewDataSource = js.native
  inline def DataSource_=(x: ListViewDataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
}
