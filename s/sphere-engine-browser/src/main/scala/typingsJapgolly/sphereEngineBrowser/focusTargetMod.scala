package typingsJapgolly.sphereEngineBrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTargetMod {
  
  /**
    * Represents an entity which can receive input focus. It is strictly enforced that only one
    * `FocusTarget` can have the focus at a time and Z-order is automatically managed.
    */
  @JSImport("focus-target", JSImport.Default)
  @js.native
  /**
    * Construct a new `FocusTarget`.
    * @param options Options for creating the new focus target.
    */
  open class default ()
    extends StObject
       with FocusTarget {
    def this(options: FocusTargetOptions) = this()
    
    /**
      * Get rid of this focus target by feeding it to the nearest eaty pig. If you don't feed it
      * enough focus targets, *you* get eaten. OH NO AAAAAAHHHHHHHHHH\*munch\*
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /** `true` if the focus target currently has the focus, otherwise `false`. */
    /* CompleteClass */
    override val hasFocus: Boolean = js.native
    
    /**
      * Attempts to give this focus target the focus. If a higher-priority target currently has
      * the focus, this will not steal it.
      */
    /* CompleteClass */
    override def takeFocus(): Unit = js.native
    
    /**
      * Yield the focus to whichever focus target previously had it. If this target does not
      * currently have the focus, `yield` has no effect.
      */
    /* CompleteClass */
    override def `yield`(): Unit = js.native
  }
  
  /**
    * Represents an entity which can receive input focus. It is strictly enforced that only one
    * `FocusTarget` can have the focus at a time and Z-order is automatically managed.
    */
  trait FocusTarget extends StObject {
    
    /**
      * Get rid of this focus target by feeding it to the nearest eaty pig. If you don't feed it
      * enough focus targets, *you* get eaten. OH NO AAAAAAHHHHHHHHHH\*munch\*
      */
    def dispose(): Unit
    
    /** `true` if the focus target currently has the focus, otherwise `false`. */
    val hasFocus: Boolean
    
    /**
      * Attempts to give this focus target the focus. If a higher-priority target currently has
      * the focus, this will not steal it.
      */
    def takeFocus(): Unit
    
    /**
      * Yield the focus to whichever focus target previously had it. If this target does not
      * currently have the focus, `yield` has no effect.
      */
    def `yield`(): Unit
  }
  object FocusTarget {
    
    inline def apply(dispose: Callback, hasFocus: Boolean, takeFocus: Callback, `yield`: Callback): FocusTarget = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, hasFocus = hasFocus.asInstanceOf[js.Any], takeFocus = takeFocus.toJsFn)
      __obj.updateDynamic("yield")(`yield`.toJsFn)
      __obj.asInstanceOf[FocusTarget]
    }
    
    extension [Self <: FocusTarget](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setTakeFocus(value: Callback): Self = StObject.set(x, "takeFocus", value.toJsFn)
      
      inline def setYield(value: Callback): Self = StObject.set(x, "yield", value.toJsFn)
    }
  }
  
  /**
    * Specifies options for creating a focus target.
    */
  trait FocusTargetOptions extends StObject {
    
    /**
      * Priority of the focus target. Higher-priority targets can take focus away from
      * lower-priority ones, but not vice versa.
      */
    var priority: js.UndefOr[Double] = js.undefined
  }
  object FocusTargetOptions {
    
    inline def apply(): FocusTargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusTargetOptions]
    }
    
    extension [Self <: FocusTargetOptions](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
