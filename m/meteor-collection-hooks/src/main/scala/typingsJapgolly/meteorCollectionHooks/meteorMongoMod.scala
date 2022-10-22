package typingsJapgolly.meteorCollectionHooks

import typingsJapgolly.meteorCollectionHooks.anon.Find
import typingsJapgolly.meteorCollectionHooks.anon.FindOne
import typingsJapgolly.meteorCollectionHooks.anon.Insert
import typingsJapgolly.meteorCollectionHooks.meteorMongoMod.CollectionHooks.GlobalHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorMongoMod {
  
  object CollectionHooks {
    
    trait GlobalHookOptions extends StObject {
      
      var after: js.UndefOr[LocalHookOptions] = js.undefined
      
      var all: js.UndefOr[LocalHookOptions] = js.undefined
      
      var before: js.UndefOr[LocalHookOptions] = js.undefined
    }
    object GlobalHookOptions {
      
      inline def apply(): GlobalHookOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GlobalHookOptions]
      }
      
      extension [Self <: GlobalHookOptions](x: Self) {
        
        inline def setAfter(value: LocalHookOptions): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
        
        inline def setAll(value: LocalHookOptions): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
        
        inline def setBefore(value: LocalHookOptions): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      }
    }
    
    trait HookOptionValue extends StObject {
      
      var fetchPrevious: js.UndefOr[Boolean] = js.undefined
    }
    object HookOptionValue {
      
      inline def apply(): HookOptionValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HookOptionValue]
      }
      
      extension [Self <: HookOptionValue](x: Self) {
        
        inline def setFetchPrevious(value: Boolean): Self = StObject.set(x, "fetchPrevious", value.asInstanceOf[js.Any])
        
        inline def setFetchPreviousUndefined: Self = StObject.set(x, "fetchPrevious", js.undefined)
      }
    }
    
    trait LocalHookOptions extends StObject {
      
      var all: js.UndefOr[HookOptionValue] = js.undefined
      
      var find: js.UndefOr[HookOptionValue] = js.undefined
      
      var findOne: js.UndefOr[HookOptionValue] = js.undefined
      
      var insert: js.UndefOr[HookOptionValue] = js.undefined
      
      var remove: js.UndefOr[HookOptionValue] = js.undefined
      
      var update: js.UndefOr[HookOptionValue] = js.undefined
      
      var upsert: js.UndefOr[HookOptionValue] = js.undefined
    }
    object LocalHookOptions {
      
      inline def apply(): LocalHookOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocalHookOptions]
      }
      
      extension [Self <: LocalHookOptions](x: Self) {
        
        inline def setAll(value: HookOptionValue): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
        
        inline def setFind(value: HookOptionValue): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
        
        inline def setFindOne(value: HookOptionValue): Self = StObject.set(x, "findOne", value.asInstanceOf[js.Any])
        
        inline def setFindOneUndefined: Self = StObject.set(x, "findOne", js.undefined)
        
        inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
        
        inline def setInsert(value: HookOptionValue): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
        
        inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
        
        inline def setRemove(value: HookOptionValue): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
        
        inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
        
        inline def setUpdate(value: HookOptionValue): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
        
        inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
        
        inline def setUpsert(value: HookOptionValue): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
        
        inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
      }
    }
    
    trait ModifierOptions extends StObject {
      
      var multi: js.UndefOr[Boolean] = js.undefined
      
      var upsert: js.UndefOr[Boolean] = js.undefined
    }
    object ModifierOptions {
      
      inline def apply(): ModifierOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifierOptions]
      }
      
      extension [Self <: ModifierOptions](x: Self) {
        
        inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
        
        inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
        
        inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
        
        inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
      }
    }
  }
  
  object Mongo {
    
    trait Collection[T] extends StObject {
      
      var after: FindOne[T]
      
      var before: Find[T]
      
      var direct: Insert[T]
      
      var hookOptions: GlobalHookOptions
    }
    object Collection {
      
      inline def apply[T](after: FindOne[T], before: Find[T], direct: Insert[T], hookOptions: GlobalHookOptions): Collection[T] = {
        val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], direct = direct.asInstanceOf[js.Any], hookOptions = hookOptions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Collection[T]]
      }
      
      extension [Self <: Collection[?], T](x: Self & Collection[T]) {
        
        inline def setAfter(value: FindOne[T]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        inline def setBefore(value: Find[T]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        inline def setDirect(value: Insert[T]): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
        
        inline def setHookOptions(value: GlobalHookOptions): Self = StObject.set(x, "hookOptions", value.asInstanceOf[js.Any])
      }
    }
  }
}
