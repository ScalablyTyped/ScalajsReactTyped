package typingsJapgolly.screepsArena

import typingsJapgolly.screepsArena.gameConstantsMod.BodyPartConstant
import typingsJapgolly.screepsArena.gamePrototypesMod.ConstructorById
import typingsJapgolly.screepsArena.gamePrototypesMod.GameObject
import typingsJapgolly.screepsArena.gamePrototypesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arenaPrototypesMod {
  
  @js.native
  trait BodyPart
    extends StObject
       with GameObject {
    
    /**
      * The number of ticks until this item disappears.
      */
    var ticksToDecay: Double = js.native
    
    /**
      * The type of the body part.
      */
    var `type`: BodyPartConstant = js.native
  }
  @JSImport("arena/prototypes", "BodyPart")
  @js.native
  val BodyPart: BodyPartConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena/prototypes", "BodyPart")
  @js.native
  open class BodyPartCls ()
    extends StObject
       with typingsJapgolly.screepsArena.arenaPrototypesMod.BodyPart {
    def this(id: Id[typingsJapgolly.screepsArena.arenaPrototypesMod.BodyPart]) = this()
    
    /**
      * X position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Y position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @js.native
  trait Flag
    extends StObject
       with GameObject {
    
    /**
      * Equals to true or false if the flag is owned.
      * Returns undefined if it is neutral.
      */
    var my: js.UndefOr[Boolean] = js.native
  }
  @JSImport("arena/prototypes", "Flag")
  @js.native
  val Flag: FlagConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena/prototypes", "Flag")
  @js.native
  open class FlagCls ()
    extends StObject
       with typingsJapgolly.screepsArena.arenaPrototypesMod.Flag {
    def this(id: Id[typingsJapgolly.screepsArena.arenaPrototypesMod.Flag]) = this()
    
    /**
      * X position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Y position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @js.native
  trait BodyPartConstructor
    extends StObject
       with ConstructorById[typingsJapgolly.screepsArena.arenaPrototypesMod.BodyPart]
  
  @js.native
  trait FlagConstructor
    extends StObject
       with ConstructorById[typingsJapgolly.screepsArena.arenaPrototypesMod.Flag]
}
