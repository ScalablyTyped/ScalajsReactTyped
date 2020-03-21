package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aframe.AnonGetMeshMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFrame extends js.Object {
  var AComponent: Component[_, System[_]]
  var AEntity: Entity[ObjectMap[Component[_, System[_]]]]
  var ANode: typingsJapgolly.aframe.mod.ANode
  var AScene: Scene
  var THREE: ThreeLib
  var TWEEN: TweenLib
  var components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]]
  var geometries: ObjectMap[GeometryDescriptor[Geometry[_]]]
  var primitives: AnonGetMeshMixin
  var scenes: js.Array[Scene]
  var schema: SchemaUtils
  var shaders: ObjectMap[ShaderDescriptor[Shader]]
  var systems: ObjectMap[SystemConstructor[js.Object]]
  var utils: Utils_
  var version: String
  def registerComponent[T /* <: js.Object */](name: String, component: ComponentDefinition[T]): ComponentConstructor[T]
  def registerElement(name: String, element: js.Object): Unit
  def registerGeometry[T /* <: js.Object */](name: String, geometry: GeometryDefinition[T, _]): GeometryConstructor[T]
  def registerPrimitive(name: String, primitive: PrimitiveDefinition): Unit
  def registerShader[T /* <: MinimalShaderDefinition with js.Object */](name: String, shader: ShaderDefinition[T]): ShaderConstructor[T]
  def registerSystem[T /* <: js.Object */](name: String, definition: SystemDefinition[T]): SystemConstructor[T]
}

object AFrame {
  @scala.inline
  def apply(
    AComponent: Component[_, System[_]],
    AEntity: Entity[ObjectMap[Component[_, System[_]]]],
    ANode: ANode,
    AScene: Scene,
    THREE: ThreeLib,
    TWEEN: TweenLib,
    components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]],
    geometries: ObjectMap[GeometryDescriptor[Geometry[_]]],
    primitives: AnonGetMeshMixin,
    registerComponent: (String, ComponentDefinition[js.Any]) => CallbackTo[ComponentConstructor[js.Any]],
    registerElement: (String, js.Object) => Callback,
    registerGeometry: (String, GeometryDefinition[js.Any, js.Any]) => CallbackTo[GeometryConstructor[js.Any]],
    registerPrimitive: (String, PrimitiveDefinition) => Callback,
    registerShader: (String, ShaderDefinition[js.Any]) => CallbackTo[ShaderConstructor[js.Any]],
    registerSystem: (String, SystemDefinition[js.Any]) => CallbackTo[SystemConstructor[js.Any]],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils_,
    version: String
  ): AFrame = {
    val __obj = js.Dynamic.literal(AComponent = AComponent.asInstanceOf[js.Any], AEntity = AEntity.asInstanceOf[js.Any], ANode = ANode.asInstanceOf[js.Any], AScene = AScene.asInstanceOf[js.Any], THREE = THREE.asInstanceOf[js.Any], TWEEN = TWEEN.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], primitives = primitives.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], shaders = shaders.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("registerComponent")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.aframe.mod.ComponentDefinition[js.Any]) => registerComponent(t0, t1).runNow()))
    __obj.updateDynamic("registerElement")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => registerElement(t0, t1).runNow()))
    __obj.updateDynamic("registerGeometry")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.aframe.mod.GeometryDefinition[js.Any, js.Any]) => registerGeometry(t0, t1).runNow()))
    __obj.updateDynamic("registerPrimitive")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.aframe.mod.PrimitiveDefinition) => registerPrimitive(t0, t1).runNow()))
    __obj.updateDynamic("registerShader")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.aframe.mod.ShaderDefinition[js.Any]) => registerShader(t0, t1).runNow()))
    __obj.updateDynamic("registerSystem")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.aframe.mod.SystemDefinition[js.Any]) => registerSystem(t0, t1).runNow()))
    __obj.asInstanceOf[AFrame]
  }
}

