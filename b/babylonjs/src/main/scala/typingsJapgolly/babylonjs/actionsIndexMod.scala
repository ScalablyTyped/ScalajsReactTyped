package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import typingsJapgolly.babylonjs.anon.Name
import typingsJapgolly.babylonjs.audioSoundMod.Sound
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector2
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.nodeMod.Node
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.spritesSpriteMod.Sprite
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsIndexMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Actions/index", "AbstractActionManager")
  @js.native
  open class AbstractActionManager ()
    extends typingsJapgolly.babylonjs.actionsAbstractActionManagerMod.AbstractActionManager
  /* static members */
  object AbstractActionManager {
    
    @JSImport("babylonjs/Actions/index", "AbstractActionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Does exist one action manager that handles actions of a given trigger
      * @param trigger defines the trigger to be tested
      * @returns a boolean indicating whether the trigger is handled by at least one action manager
      **/
    inline def HasSpecificTrigger(trigger: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasSpecificTrigger")(trigger.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Gets the list of active triggers */
    @JSImport("babylonjs/Actions/index", "AbstractActionManager.Triggers")
    @js.native
    def Triggers: StringDictionary[Double] = js.native
    inline def Triggers_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Actions/index", "Action")
  @js.native
  open class Action protected ()
    extends typingsJapgolly.babylonjs.actionsActionMod.Action {
    /**
      * Creates a new Action
      * @param triggerOptions the trigger, with or without parameters, for the action
      * @param condition an optional determinant of action
      */
    def this(/** the trigger, with or without parameters, for the action */
    triggerOptions: Any) = this()
    def this(
      /** the trigger, with or without parameters, for the action */
    triggerOptions: Any,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  /* static members */
  object Action {
    
    @JSImport("babylonjs/Actions/index", "Action")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _GetTargetProperty(target: Node): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
    /**
      * Internal only
      * @internal
      */
    inline def _GetTargetProperty(target: Scene): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
    
    /**
      * Internal only
      * @internal
      */
    inline def _SerializeValueAsString(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_SerializeValueAsString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("babylonjs/Actions/index", "ActionEvent")
  @js.native
  open class ActionEvent protected ()
    extends typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent {
    /**
      * Creates a new ActionEvent
      * @param source The mesh or sprite that triggered the action
      * @param pointerX The X mouse cursor position at the time of the event
      * @param pointerY The Y mouse cursor position at the time of the event
      * @param meshUnderPointer The mesh that is currently pointed at (can be null)
      * @param sourceEvent the original (browser) event that triggered the ActionEvent
      * @param additionalData additional data for the event
      */
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh]
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Any,
      /** additional data for the event */
    additionalData: Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: Unit,
      /** additional data for the event */
    additionalData: Any
    ) = this()
  }
  /* static members */
  object ActionEvent {
    
    @JSImport("babylonjs/Actions/index", "ActionEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a source mesh.
      * @param source The source mesh that triggered the event
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNew(source: AbstractMesh): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Any, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNew(source: AbstractMesh, evt: Unit, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(source.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a primitive
      * @param prim defines the target primitive
      * @param pointerPos defines the pointer position
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Unit, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromPrimitive")(prim.asInstanceOf[js.Any], pointerPos.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
      * @param scene the scene where the event occurred
      * @param evt The original (browser) event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromScene(scene: Scene, evt: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromScene")(scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    
    /**
      * Helper function to auto-create an ActionEvent from a source sprite
      * @param source The source sprite that triggered the event
      * @param scene Scene associated with the sprite
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    inline def CreateNewFromSprite(source: Sprite, scene: Scene): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Any, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
    inline def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Unit, additionalData: Any): typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromSprite")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent]
  }
  
  @JSImport("babylonjs/Actions/index", "ActionManager")
  @js.native
  /**
    * Creates a new action manager
    * @param scene defines the hosting scene
    */
  open class ActionManager ()
    extends typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager {
    def this(scene: Nullable[Scene]) = this()
  }
  /* static members */
  object ActionManager {
    
    @JSImport("babylonjs/Actions/index", "ActionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get a trigger name by index
      * @param trigger defines the trigger index
      * @returns a trigger name
      */
    inline def GetTriggerName(trigger: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTriggerName")(trigger.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Nothing
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.NothingTrigger")
    @js.native
    val NothingTrigger: Double = js.native
    
    /**
      * On center pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnCenterPickTrigger")
    @js.native
    val OnCenterPickTrigger: Double = js.native
    
    /**
      * On double pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnDoublePickTrigger")
    @js.native
    val OnDoublePickTrigger: Double = js.native
    
    /**
      * On every frame
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnEveryFrameTrigger")
    @js.native
    val OnEveryFrameTrigger: Double = js.native
    
    /**
      * On intersection enter
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnIntersectionEnterTrigger")
    @js.native
    val OnIntersectionEnterTrigger: Double = js.native
    
    /**
      * On intersection exit
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnIntersectionExitTrigger")
    @js.native
    val OnIntersectionExitTrigger: Double = js.native
    
    /**
      * On key down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnKeyDownTrigger")
    @js.native
    val OnKeyDownTrigger: Double = js.native
    
    /**
      * On key up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnKeyUpTrigger")
    @js.native
    val OnKeyUpTrigger: Double = js.native
    
    /**
      * On left pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnLeftPickTrigger")
    @js.native
    val OnLeftPickTrigger: Double = js.native
    
    /**
      * On long press
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnLongPressTrigger")
    @js.native
    val OnLongPressTrigger: Double = js.native
    
    /**
      * On pick down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickDownTrigger")
    @js.native
    val OnPickDownTrigger: Double = js.native
    
    /**
      * On pick out.
      * This trigger will only be raised if you also declared a OnPickDown
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickOutTrigger")
    @js.native
    val OnPickOutTrigger: Double = js.native
    
    /**
      * On pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickTrigger")
    @js.native
    val OnPickTrigger: Double = js.native
    
    /**
      * On pick up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickUpTrigger")
    @js.native
    val OnPickUpTrigger: Double = js.native
    
    /**
      * On pointer out
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPointerOutTrigger")
    @js.native
    val OnPointerOutTrigger: Double = js.native
    
    /**
      * On pointer over
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPointerOverTrigger")
    @js.native
    val OnPointerOverTrigger: Double = js.native
    
    /**
      * On right pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnRightPickTrigger")
    @js.native
    val OnRightPickTrigger: Double = js.native
    
    /**
      * Creates a new ActionManager from a JSON data
      * @param parsedActions defines the JSON data to read from
      * @param object defines the hosting mesh
      * @param scene defines the hosting scene
      */
    inline def Parse(parsedActions: Any, `object`: Nullable[AbstractMesh], scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedActions.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Actions/index", "CombineAction")
  @js.native
  open class CombineAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.CombineAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param children defines the list of aggregated animations to run
      * @param condition defines the trigger related conditions
      * @param enableChildrenConditions defines if the children actions conditions should be check before execution
      */
    def this(triggerOptions: Any, children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action]) = this()
    def this(
      triggerOptions: Any,
      children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
    def this(
      triggerOptions: Any,
      children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
      condition: Unit,
      enableChildrenConditions: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      children: js.Array[typingsJapgolly.babylonjs.actionsActionMod.Action],
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      enableChildrenConditions: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "Condition")
  @js.native
  open class Condition protected ()
    extends typingsJapgolly.babylonjs.actionsConditionMod.Condition {
    /**
      * Creates a new Condition
      * @param actionManager the manager of the action the condition is applied to
      */
    def this(actionManager: typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "DoNothingAction")
  @js.native
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param condition defines the trigger related conditions
    */
  open class DoNothingAction ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.DoNothingAction {
    def this(triggerOptions: Any) = this()
    def this(triggerOptions: Any, condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition) = this()
    def this(triggerOptions: Unit, condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "ExecuteCodeAction")
  @js.native
  open class ExecuteCodeAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.ExecuteCodeAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param func defines the callback function to run
      * @param condition defines the trigger related conditions
      */
    def this(
      triggerOptions: Any,
      func: js.Function1[/* evt */ typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent, Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      func: js.Function1[/* evt */ typingsJapgolly.babylonjs.actionsActionEventMod.ActionEvent, Unit],
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "IncrementValueAction")
  @js.native
  open class IncrementValueAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.IncrementValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to increment in the target
      * @param value defines the value value we should increment the property by
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "InterpolateValueAction")
  @js.native
  open class InterpolateValueAction protected ()
    extends typingsJapgolly.babylonjs.actionsInterpolateValueActionMod.InterpolateValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the value to interpolate
      * @param propertyPath defines the path to the property in the target object
      * @param value defines the target value at the end of the interpolation
      * @param duration defines the time it will take for the property to interpolate to the value.
      * @param condition defines the trigger related conditions
      * @param stopOtherAnimations defines if the other scene animations should be stopped when the action has been triggered
      * @param onInterpolationDone defines a callback raised once the interpolation animation has been done
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any, duration: Double) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PlayAnimationAction")
  @js.native
  open class PlayAnimationAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.PlayAnimationAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param from defines from where the animation should start (animation frame)
      * @param to defines where the animation should stop (animation frame)
      * @param loop defines if the animation should loop or stop after the first play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, from: Double, to: Double) = this()
    def this(triggerOptions: Any, target: Any, from: Double, to: Double, loop: Boolean) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      from: Double,
      to: Double,
      loop: Boolean,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      from: Double,
      to: Double,
      loop: Unit,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PlaySoundAction")
  @js.native
  open class PlaySoundAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectAudioActionsMod.PlaySoundAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, sound: Sound) = this()
    def this(
      triggerOptions: Any,
      sound: Sound,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PredicateCondition")
  @js.native
  open class PredicateCondition protected ()
    extends typingsJapgolly.babylonjs.actionsConditionMod.PredicateCondition {
    /**
      * Creates a new PredicateCondition
      * @param actionManager manager for the action the condition applies to
      * @param predicate defines the predicate function used to validate the condition
      */
    def this(
      actionManager: typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager,
      /** defines the predicate function used to validate the condition */
    predicate: js.Function0[Boolean]
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetParentAction")
  @js.native
  open class SetParentAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.SetParentAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target containing the parent property
      * @param parent defines from where the animation should start (animation frame)
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, parent: Any) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      parent: Any,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetStateAction")
  @js.native
  open class SetStateAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.SetStateAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the state property
      * @param value defines the value to store in the state field
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, value: String) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      value: String,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetValueAction")
  @js.native
  open class SetValueAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.SetValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to set in the target
      * @param value defines the value to set in the property
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StateCondition")
  @js.native
  open class StateCondition protected ()
    extends typingsJapgolly.babylonjs.actionsConditionMod.StateCondition {
    /**
      * Creates a new StateCondition
      * @param actionManager manager for the action the condition applies to
      * @param target of the condition
      * @param value to compare with target state
      */
    def this(
      actionManager: typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager,
      target: Any,
      /** Value to compare with target state  */
    value: String
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StopAnimationAction")
  @js.native
  open class StopAnimationAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.StopAnimationAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StopSoundAction")
  @js.native
  open class StopSoundAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectAudioActionsMod.StopSoundAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to stop
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, sound: Sound) = this()
    def this(
      triggerOptions: Any,
      sound: Sound,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SwitchBooleanAction")
  @js.native
  open class SwitchBooleanAction protected ()
    extends typingsJapgolly.babylonjs.actionsDirectActionsMod.SwitchBooleanAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the boolean
      * @param propertyPath defines the path to the boolean property in the target object
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      condition: typingsJapgolly.babylonjs.actionsConditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "ValueCondition")
  @js.native
  open class ValueCondition protected ()
    extends typingsJapgolly.babylonjs.actionsConditionMod.ValueCondition {
    /**
      * Creates a new ValueCondition
      * @param actionManager manager for the action the condition applies to
      * @param target for the action
      * @param propertyPath path to specify the property of the target the conditional operator uses
      * @param value the value compared by the conditional operator against the current value of the property
      * @param operator the conditional operator, default ValueCondition.IsEqual
      */
    def this(
      actionManager: typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager,
      target: Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: Any
    ) = this()
    def this(
      actionManager: typingsJapgolly.babylonjs.actionsActionManagerMod.ActionManager,
      target: Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: Any,
      /** the conditional operator, default ValueCondition.IsEqual */
    operator: Double
    ) = this()
  }
  /* static members */
  object ValueCondition {
    
    @JSImport("babylonjs/Actions/index", "ValueCondition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the name of the conditional operator for the ValueCondition
      * @param operator the conditional operator
      * @returns the name
      */
    inline def GetOperatorName(operator: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOperatorName")(operator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsDifferent")
    @js.native
    def _IsDifferent: Any = js.native
    inline def _IsDifferent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsEqual")
    @js.native
    def _IsEqual: Any = js.native
    inline def _IsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsGreater")
    @js.native
    def _IsGreater: Any = js.native
    inline def _IsGreater_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsLesser")
    @js.native
    def _IsLesser: Any = js.native
    inline def _IsLesser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
  }
}
