package typingsJapgolly.`3dBinPacking`.bws.packer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface of physical 3D-instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.IEntity * / any */ trait Instance extends js.Object {
  /**
    * <p> A type, identifier of derived class. </p>
    *
    * <h4> Derived types </h4>
    * <ul>
    *	<li> {@link Product product} </li>
    *	<li> {@link Wrapper wrapper} </li>
    * <ul>
    */
  def TYPE(): String
  /**
    * Get height, length on the Y-axis in 3D.
    */
  def getHeight(): Double
  /**
    * Get length, length on the Z-axis in 3D.
    */
  def getLength(): Double
  /**
    * Get name.
    */
  def getName(): String
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  def getVolume(): Double
  /**
    * Get width, length on the X-axis in 3D.
    */
  def getWidth(): Double
  /**
    * Set height, length on the Y-axis in 3D.
    */
  def setHeight(`val`: Double): Unit
  /**
    * Set length, length on the Z-axis in 3D.
    */
  def setLength(`val`: Double): Unit
  /**
    * Set name.
    */
  def setName(`val`: String): Unit
  /**
    * Set width, length on the X-axis in 3D.
    */
  def setWidth(`val`: Double): Unit
}

object Instance {
  @scala.inline
  def apply(
    TYPE: CallbackTo[String],
    getHeight: CallbackTo[Double],
    getLength: CallbackTo[Double],
    getName: CallbackTo[String],
    getVolume: CallbackTo[Double],
    getWidth: CallbackTo[Double],
    setHeight: Double => Callback,
    setLength: Double => Callback,
    setName: String => Callback,
    setWidth: Double => Callback
  ): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TYPE")(TYPE.toJsFn)
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getVolume")(getVolume.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: scala.Double) => setHeight(t0).runNow()))
    __obj.updateDynamic("setLength")(js.Any.fromFunction1((t0: scala.Double) => setLength(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: scala.Double) => setWidth(t0).runNow()))
    __obj.asInstanceOf[Instance]
  }
}

