package typingsJapgolly.history

import typingsJapgolly.history.mod.Hash
import typingsJapgolly.history.mod.Key
import typingsJapgolly.history.mod.Pathname
import typingsJapgolly.history.mod.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<history.history.Location> */
  trait PartialLocation extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    extension [Self <: PartialLocation](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<history.history.Path> */
  trait PartialPath extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
  }
  object PartialPath {
    
    inline def apply(): PartialPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPath]
    }
    
    extension [Self <: PartialPath](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
}
