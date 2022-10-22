package typingsJapgolly.aframe.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.Schema_
import typingsJapgolly.aframe.mod.System
import typingsJapgolly.three.mod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aframe.aframe.Component<any, aframe.aframe.System<any>>> */
trait PartialComponentanySystem extends StObject {
  
  var attrName: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var el: js.UndefOr[Entity[ObjectMap[Component[Any, System[Any]]]]] = js.undefined
  
  var events: js.UndefOr[Any] = js.undefined
  
  var extendSchema: js.UndefOr[js.Function1[/* update */ Schema_[js.Object], Unit]] = js.undefined
  
  var flushToDOM: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
  
  var initialized: js.UndefOr[Boolean] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var schema: js.UndefOr[Schema_[Any]] = js.undefined
  
  var system: js.UndefOr[System[Any]] = js.undefined
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  
  var tock: js.UndefOr[
    js.Function3[/* time */ Double, /* timeDelta */ Double, /* camera */ Camera, Unit]
  ] = js.undefined
  
  var update: js.UndefOr[js.Function1[/* oldData */ Any, Unit]] = js.undefined
  
  var updateSchema: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialComponentanySystem {
  
  inline def apply(): PartialComponentanySystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComponentanySystem]
  }
  
  extension [Self <: PartialComponentanySystem](x: Self) {
    
    inline def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
    
    inline def setAttrNameUndefined: Self = StObject.set(x, "attrName", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setEl(value: Entity[ObjectMap[Component[Any, System[Any]]]]): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setExtendSchema(value: /* update */ Schema_[js.Object] => Callback): Self = StObject.set(x, "extendSchema", js.Any.fromFunction1((t0: /* update */ Schema_[js.Object]) => value(t0).runNow()))
    
    inline def setExtendSchemaUndefined: Self = StObject.set(x, "extendSchema", js.undefined)
    
    inline def setFlushToDOM(value: Callback): Self = StObject.set(x, "flushToDOM", value.toJsFn)
    
    inline def setFlushToDOMUndefined: Self = StObject.set(x, "flushToDOM", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInit(value: /* data */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* data */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSchema(value: Schema_[Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSystem(value: System[Any]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Callback): Self = StObject.set(x, "tick", js.Any.fromFunction2((t0: /* time */ Double, t1: /* timeDelta */ Double) => (value(t0, t1)).runNow()))
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTock(value: (/* time */ Double, /* timeDelta */ Double, /* camera */ Camera) => Callback): Self = StObject.set(x, "tock", js.Any.fromFunction3((t0: /* time */ Double, t1: /* timeDelta */ Double, t2: /* camera */ Camera) => (value(t0, t1, t2)).runNow()))
    
    inline def setTockUndefined: Self = StObject.set(x, "tock", js.undefined)
    
    inline def setUpdate(value: /* oldData */ Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* oldData */ Any) => value(t0).runNow()))
    
    inline def setUpdateSchema(value: Callback): Self = StObject.set(x, "updateSchema", value.toJsFn)
    
    inline def setUpdateSchemaUndefined: Self = StObject.set(x, "updateSchema", js.undefined)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
