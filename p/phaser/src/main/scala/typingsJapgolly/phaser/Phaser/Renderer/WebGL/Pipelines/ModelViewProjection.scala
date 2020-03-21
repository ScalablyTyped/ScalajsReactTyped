package typingsJapgolly.phaser.Phaser.Renderer.WebGL.Pipelines

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements a model view projection matrices.
  * Pipelines can implement this for doing 2D and 3D rendering.
  */
trait ModelViewProjection extends js.Object {
  /**
    * Model matrix
    */
  var modelMatrix: scala.scalajs.js.typedarray.Float32Array
  /**
    * Dirty flag for checking if model matrix needs to be updated on GPU.
    */
  var modelMatrixDirty: Boolean
  /**
    * Projection matrix
    */
  var projectionMatrix: scala.scalajs.js.typedarray.Float32Array
  /**
    * Dirty flag for checking if projection matrix needs to be updated on GPU.
    */
  var projectionMatrixDirty: Boolean
  /**
    * View matrix
    */
  var viewMatrix: scala.scalajs.js.typedarray.Float32Array
  /**
    * Dirty flag for checking if view matrix needs to be updated on GPU.
    */
  var viewMatrixDirty: Boolean
  /**
    * Loads an identity matrix to the model matrix
    */
  def modelIdentity(): Unit
  /**
    * Rotates the model matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateX(radians: Double): this.type
  /**
    * Rotates the model matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateY(radians: Double): this.type
  /**
    * Rotates the model matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateZ(radians: Double): this.type
  /**
    * Scale model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelScale(x: Double, y: Double, z: Double): this.type
  /**
    * Translate model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelTranslate(x: Double, y: Double, z: Double): this.type
  /**
    * Initializes MVP matrices with an identity matrix
    */
  def mvpInit(): Unit
  /**
    * If dirty flags are set then the matrices are uploaded to the GPU.
    */
  def mvpUpdate(): Unit
  /**
    * Loads identity matrix into the projection matrix.
    */
  def projIdentity(): this.type
  /**
    * Sets up an orthographic projection matrix
    * @param left The left value.
    * @param right The right value.
    * @param bottom The bottom value.
    * @param top The top value.
    * @param near The near value.
    * @param far The far value.
    */
  def projOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type
  /**
    * Sets up a perspective projection matrix
    * @param fovY The fov value.
    * @param aspectRatio The aspectRatio value.
    * @param near The near value.
    * @param far The far value.
    */
  def projPersp(fovY: Double, aspectRatio: Double, near: Double, far: Double): this.type
  /**
    * Loads identity matrix into the view matrix
    */
  def viewIdentity(): this.type
  /**
    * Copies a 4x4 matrix into the view matrix
    * @param matrix The Matrix2D.
    */
  def viewLoad(matrix: scala.scalajs.js.typedarray.Float32Array): this.type
  /**
    * Loads a 2D view matrix (3x2 matrix) into a 4x4 view matrix
    * @param matrix2D The Matrix2D.
    */
  def viewLoad2D(matrix2D: scala.scalajs.js.typedarray.Float32Array): this.type
  /**
    * Rotates view matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateX(radians: Double): this.type
  /**
    * Rotates view matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateY(radians: Double): this.type
  /**
    * Rotates view matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateZ(radians: Double): this.type
  /**
    * Scales view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewScale(x: Double, y: Double, z: Double): this.type
  /**
    * Translates view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewTranslate(x: Double, y: Double, z: Double): this.type
}

object ModelViewProjection {
  @scala.inline
  def apply(
    modelIdentity: Callback,
    modelMatrix: scala.scalajs.js.typedarray.Float32Array,
    modelMatrixDirty: Boolean,
    modelRotateX: Double => CallbackTo[ModelViewProjection],
    modelRotateY: Double => CallbackTo[ModelViewProjection],
    modelRotateZ: Double => CallbackTo[ModelViewProjection],
    modelScale: (Double, Double, Double) => CallbackTo[ModelViewProjection],
    modelTranslate: (Double, Double, Double) => CallbackTo[ModelViewProjection],
    mvpInit: Callback,
    mvpUpdate: Callback,
    projIdentity: CallbackTo[ModelViewProjection],
    projOrtho: (Double, Double, Double, Double, Double, Double) => CallbackTo[ModelViewProjection],
    projPersp: (Double, Double, Double, Double) => CallbackTo[ModelViewProjection],
    projectionMatrix: scala.scalajs.js.typedarray.Float32Array,
    projectionMatrixDirty: Boolean,
    viewIdentity: CallbackTo[ModelViewProjection],
    viewLoad: scala.scalajs.js.typedarray.Float32Array => CallbackTo[ModelViewProjection],
    viewLoad2D: scala.scalajs.js.typedarray.Float32Array => CallbackTo[ModelViewProjection],
    viewMatrix: scala.scalajs.js.typedarray.Float32Array,
    viewMatrixDirty: Boolean,
    viewRotateX: Double => CallbackTo[ModelViewProjection],
    viewRotateY: Double => CallbackTo[ModelViewProjection],
    viewRotateZ: Double => CallbackTo[ModelViewProjection],
    viewScale: (Double, Double, Double) => CallbackTo[ModelViewProjection],
    viewTranslate: (Double, Double, Double) => CallbackTo[ModelViewProjection]
  ): ModelViewProjection = {
    val __obj = js.Dynamic.literal(modelMatrix = modelMatrix.asInstanceOf[js.Any], modelMatrixDirty = modelMatrixDirty.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], projectionMatrixDirty = projectionMatrixDirty.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any], viewMatrixDirty = viewMatrixDirty.asInstanceOf[js.Any])
    __obj.updateDynamic("modelIdentity")(modelIdentity.toJsFn)
    __obj.updateDynamic("modelRotateX")(js.Any.fromFunction1((t0: scala.Double) => modelRotateX(t0).runNow()))
    __obj.updateDynamic("modelRotateY")(js.Any.fromFunction1((t0: scala.Double) => modelRotateY(t0).runNow()))
    __obj.updateDynamic("modelRotateZ")(js.Any.fromFunction1((t0: scala.Double) => modelRotateZ(t0).runNow()))
    __obj.updateDynamic("modelScale")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => modelScale(t0, t1, t2).runNow()))
    __obj.updateDynamic("modelTranslate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => modelTranslate(t0, t1, t2).runNow()))
    __obj.updateDynamic("mvpInit")(mvpInit.toJsFn)
    __obj.updateDynamic("mvpUpdate")(mvpUpdate.toJsFn)
    __obj.updateDynamic("projIdentity")(projIdentity.toJsFn)
    __obj.updateDynamic("projOrtho")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => projOrtho(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("projPersp")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => projPersp(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("viewIdentity")(viewIdentity.toJsFn)
    __obj.updateDynamic("viewLoad")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float32Array) => viewLoad(t0).runNow()))
    __obj.updateDynamic("viewLoad2D")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float32Array) => viewLoad2D(t0).runNow()))
    __obj.updateDynamic("viewRotateX")(js.Any.fromFunction1((t0: scala.Double) => viewRotateX(t0).runNow()))
    __obj.updateDynamic("viewRotateY")(js.Any.fromFunction1((t0: scala.Double) => viewRotateY(t0).runNow()))
    __obj.updateDynamic("viewRotateZ")(js.Any.fromFunction1((t0: scala.Double) => viewRotateZ(t0).runNow()))
    __obj.updateDynamic("viewScale")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => viewScale(t0, t1, t2).runNow()))
    __obj.updateDynamic("viewTranslate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => viewTranslate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ModelViewProjection]
  }
}

