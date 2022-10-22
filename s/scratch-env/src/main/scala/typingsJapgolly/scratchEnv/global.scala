package typingsJapgolly.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /** Indicate the scope for a reporter's value. */
  @JSGlobal("ReporterScope")
  @js.native
  object ReporterScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.scratchEnv.ReporterScope & String] = js.native
    
    /* "global" */ val GLOBAL: typingsJapgolly.scratchEnv.ReporterScope.GLOBAL & String = js.native
    
    /* "target" */ val TARGET: typingsJapgolly.scratchEnv.ReporterScope.TARGET & String = js.native
  }
  
  object Scratch {
    
    /** Block argument types. */
    @JSGlobal("Scratch.ArgumentType")
    @js.native
    object ArgumentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.scratchEnv.Scratch.ArgumentType & String] = js.native
      
      /* "angle" */ val ANGLE: typingsJapgolly.scratchEnv.Scratch.ArgumentType.ANGLE & String = js.native
      
      /* "Boolean" */ val BOOLEAN: typingsJapgolly.scratchEnv.Scratch.ArgumentType.BOOLEAN & String = js.native
      
      /* "color" */ val COLOR: typingsJapgolly.scratchEnv.Scratch.ArgumentType.COLOR & String = js.native
      
      /* "image" */ val IMAGE: typingsJapgolly.scratchEnv.Scratch.ArgumentType.IMAGE & String = js.native
      
      /* "matrix" */ val MATRIX: typingsJapgolly.scratchEnv.Scratch.ArgumentType.MATRIX & String = js.native
      
      /* "note" */ val NOTE: typingsJapgolly.scratchEnv.Scratch.ArgumentType.NOTE & String = js.native
      
      /* "number" */ val NUMBER: typingsJapgolly.scratchEnv.Scratch.ArgumentType.NUMBER & String = js.native
      
      /* "string" */ val STRING: typingsJapgolly.scratchEnv.Scratch.ArgumentType.STRING & String = js.native
    }
    
    /** Types of blocks. */
    @JSGlobal("Scratch.BlockType")
    @js.native
    object BlockType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.scratchEnv.Scratch.BlockType & String] = js.native
      
      /* "Boolean" */ val BOOLEAN: typingsJapgolly.scratchEnv.Scratch.BlockType.BOOLEAN & String = js.native
      
      /* "button" */ val BUTTON: typingsJapgolly.scratchEnv.Scratch.BlockType.BUTTON & String = js.native
      
      /* "command" */ val COMMAND: typingsJapgolly.scratchEnv.Scratch.BlockType.COMMAND & String = js.native
      
      /* "conditional" */ val CONDITIONAL: typingsJapgolly.scratchEnv.Scratch.BlockType.CONDITIONAL & String = js.native
      
      /* "event" */ val EVENT: typingsJapgolly.scratchEnv.Scratch.BlockType.EVENT & String = js.native
      
      /* "hat" */ val HAT: typingsJapgolly.scratchEnv.Scratch.BlockType.HAT & String = js.native
      
      /* "loop" */ val LOOP: typingsJapgolly.scratchEnv.Scratch.BlockType.LOOP & String = js.native
      
      /* "reporter" */ val REPORTER: typingsJapgolly.scratchEnv.Scratch.BlockType.REPORTER & String = js.native
    }
    
    /** Default types of target supported by the VM. */
    @JSGlobal("Scratch.TargetType")
    @js.native
    object TargetType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.scratchEnv.Scratch.TargetType & String] = js.native
      
      /* "sprite" */ val SPRITE: typingsJapgolly.scratchEnv.Scratch.TargetType.SPRITE & String = js.native
      
      /* "stage" */ val STAGE: typingsJapgolly.scratchEnv.Scratch.TargetType.STAGE & String = js.native
    }
    
    object extensions {
      
      @JSGlobal("Scratch.extensions")
      @js.native
      val ^ : js.Any = js.native
      
      /** Register an extension. */
      inline def register(`extension`: typingsJapgolly.scratchEnv.ScratchExtension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
  
  @JSGlobal("ScratchExtension")
  @js.native
  open class ScratchExtension ()
    extends StObject
       with typingsJapgolly.scratchEnv.ScratchExtension {
    
    /** Returns data about the extension. */
    /* CompleteClass */
    override def getInfo(): ExtensionMetadata = js.native
  }
}
