package typingsJapgolly.preact.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.preact.anon.ChildrenComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNode[P] extends StObject {
  
  /**
  	 * The time that the rendering of this `vnode` was completed. Will only be
  	 * set when the devtools are attached.
  	 * Default value: `-1`
  	 */
  var endTime: js.UndefOr[Double] = js.undefined
  
  var key: Key
  
  var props: P & ChildrenComponentChildren
  
  /**
  	 * ref is not guaranteed by React.ReactElement, for compatibility reasons
  	 * with popular react libs we define it as optional too
  	 */
  var ref: js.UndefOr[Ref[Any] | Null] = js.undefined
  
  /**
  	 * The time this `vnode` started rendering. Will only be set when
  	 * the devtools are attached.
  	 * Default value: `0`
  	 */
  var startTime: js.UndefOr[Double] = js.undefined
  
  var `type`: ComponentType[P] | String
}
object VNode {
  
  inline def apply[P](key: Key, props: P & ChildrenComponentChildren, `type`: ComponentType[P] | String): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
  
  extension [Self <: VNode[?], P](x: Self & VNode[P]) {
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & ChildrenComponentChildren): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setType(value: ComponentType[P] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
