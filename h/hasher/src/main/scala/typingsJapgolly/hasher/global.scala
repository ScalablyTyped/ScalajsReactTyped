package typingsJapgolly.hasher

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hasher.mod.HasherJs.HasherStatic
import typingsJapgolly.signals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object hasher extends Shortcut {
    
    @JSGlobal("hasher")
    @js.native
    val ^ : HasherStatic = js.native
    
    // default value: '';
    // will be automatically removed from `hasher.getHash()`
    // avoid conflicts with elements that contain ID equal to hash value;
    // <static> {signals.Signal} hasher.changed
    // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("hasher.changed")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class changed ()
      extends StObject
         with Signal[Any]
    
    // <static> {signals.Signal} hasher.initialized
    // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("hasher.initialized")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class initialized ()
      extends StObject
         with Signal[Any]
    
    // default value: '/';
    // <static> {signals.Signal} hasher.stopped
    // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("hasher.stopped")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class stopped ()
      extends StObject
         with Signal[Any]
    
    type _To = HasherStatic
    
    /* This means you don't have to write `^`, but can instead just say `hasher.foo` */
    override def _to: HasherStatic = ^
  }
}
