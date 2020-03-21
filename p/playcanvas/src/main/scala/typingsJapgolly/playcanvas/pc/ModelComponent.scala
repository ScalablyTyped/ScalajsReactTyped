package typingsJapgolly.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ModelComponent
  * @augments pc.Component
  * @classdesc Enables an Entity to render a model or a primitive shape. This Component attaches additional model
  * geometry in to the scene graph below the Entity.
  * @description Create a new ModelComponent.
  * @param {pc.ModelComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {string} type The type of the model, which can be one of the following values:
  *
  * * "asset": The component will render a model asset
  * * "box": The component will render a box (1 unit in each dimension)
  * * "capsule": The component will render a capsule (radius 0.5, height 2)
  * * "cone": The component will render a cone (radius 0.5, height 1)
  * * "cylinder": The component will render a cylinder (radius 0.5, height 1)
  * * "plane": The component will render a plane (1 unit in each dimension)
  * * "sphere": The component will render a sphere (radius 0.5)
  *
  * @property {pc.Asset|number} asset The asset for the model (only applies to models of type 'asset') - can also be an asset id.
  * @property {boolean} castShadows If true, this model will cast shadows for lights that have shadow casting enabled.
  * @property {boolean} receiveShadows If true, shadows will be cast on this model.
  * @property {pc.Material} material The material {@link pc.Material} that will be used to render the model. Setting
  * this property will apply the material to all mesh instances of the model.
  * @property {pc.Asset|number} materialAsset The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset').
  * @property {pc.Model} model The model that is added to the scene graph. It can be not set or loaded, so will return null.
  * @property {object} mapping A dictionary that holds material overrides for each mesh instance. Only applies to model
  * components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
  * @property {boolean} castShadowsLightmap If true, this model will cast shadows when rendering lightmaps.
  * @property {boolean} lightmapped If true, this model will be lightmapped after using lightmapper.bake().
  * @property {number} lightmapSizeMultiplier Lightmap resolution multiplier.
  * @property {boolean} isStatic Mark model as non-movable (optimization).
  * @property {pc.MeshInstance[]} meshInstances An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
  * @property {number} batchGroupId Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  */
@JSGlobal("pc.ModelComponent")
@js.native
class ModelComponent protected () extends Component {
  def this(system: ModelComponentSystem, entity: Entity) = this()
  /**
    * The asset for the model (only applies to models of type 'asset') - can also be an asset id.
    */
  var asset: Asset | Double = js.native
  /**
    * Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
    */
  var batchGroupId: Double = js.native
  /**
    * If true, this model will cast shadows for lights that have shadow casting enabled.
    */
  var castShadows: Boolean = js.native
  /**
    * If true, this model will cast shadows when rendering lightmaps.
    */
  var castShadowsLightmap: Boolean = js.native
  /**
    * Mark model as non-movable (optimization).
    */
  var isStatic: Boolean = js.native
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
    * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
    */
  var layers: js.Array[Double] = js.native
  /**
    * Lightmap resolution multiplier.
    */
  var lightmapSizeMultiplier: Double = js.native
  /**
    * If true, this model will be lightmapped after using lightmapper.bake().
    */
  var lightmapped: Boolean = js.native
  /**
    * A dictionary that holds material overrides for each mesh instance. Only applies to model
    * components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
    */
  var mapping: js.Any = js.native
  /**
    * The material {@link pc.Material} that will be used to render the model. Setting
    * this property will apply the material to all mesh instances of the model.
    */
  var material: Material = js.native
  /**
    * The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset').
    */
  var materialAsset: Asset | Double = js.native
  /**
    * An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
    */
  var meshInstances: js.Array[MeshInstance] = js.native
  /**
    * The model that is added to the scene graph. It can be not set or loaded, so will return null.
    */
  var model: Model = js.native
  /**
    * If true, shadows will be cast on this model.
    */
  var receiveShadows: Boolean = js.native
  /**
    * The type of the model, which can be one of the following values:
    * * "asset": The component will render a model asset
    * * "box": The component will render a box (1 unit in each dimension)
    * * "capsule": The component will render a capsule (radius 0.5, height 2)
    * * "cone": The component will render a cone (radius 0.5, height 1)
    * * "cylinder": The component will render a cylinder (radius 0.5, height 1)
    * * "plane": The component will render a plane (1 unit in each dimension)
    * * "sphere": The component will render a sphere (radius 0.5)
    */
  var `type`: String = js.native
  /**
    * @function
    * @name pc.ModelComponent#hide
    * @description Stop rendering model without removing it from the scene hierarchy.
    * This method sets the {@link pc.MeshInstance#visible} property of every MeshInstance in the model to false
    * Note, this does not remove the model or mesh instances from the scene hierarchy or draw call list.
    * So the model component still incurs some CPU overhead.
    * @example
    * this.timer = 0;
    * this.visible = true;
    * // ...
    * // blink model every 0.1 seconds
    * this.timer += dt;
    * if (this.timer > 0.1) {
    *     if (!this.visible) {
    *         this.entity.model.show();
    *         this.visible = true;
    *     } else {
    *         this.entity.model.hide();
    *         this.visible = false;
    *     }
    *     this.timer = 0;
    * }
    */
  def hide(): Unit = js.native
  /**
    * @function
    * @name pc.ModelComponent#show
    * @description Enable rendering of the model if hidden using {@link pc.ModelComponent#hide}.
    * This method sets all the {@link pc.MeshInstance#visible} property on all mesh instances to true.
    */
  def show(): Unit = js.native
}

