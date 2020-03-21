package typingsJapgolly.androiduix.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.widget.RatingBar.OnRatingBarChangeListener
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RatingBar")
@js.native
class RatingBar_ protected () extends AbsSeekBar {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mNumStars: js.Any = js.native
  var mOnRatingBarChangeListener: js.Any = js.native
  var mProgressOnStartTracking: js.Any = js.native
  def dispatchRatingChange(fromUser: Boolean): Unit = js.native
  def getNumStars(): Double = js.native
  def getOnRatingBarChangeListener(): OnRatingBarChangeListener = js.native
  /* private */ def getProgressPerStar(): js.Any = js.native
  def getRating(): Double = js.native
  def getStepSize(): Double = js.native
  def isIndicator(): Boolean = js.native
  def setIsIndicator(isIndicator: Boolean): Unit = js.native
  def setNumStars(numStars: Double): Unit = js.native
  def setOnRatingBarChangeListener(listener: OnRatingBarChangeListener): Unit = js.native
  def setRating(rating: Double): Unit = js.native
  def setStepSize(stepSize: Double): Unit = js.native
  /* private */ def updateSecondaryProgress(progress: js.Any): js.Any = js.native
}

