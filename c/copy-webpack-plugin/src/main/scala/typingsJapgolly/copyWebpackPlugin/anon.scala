package typingsJapgolly.copyWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.copyWebpackPlugin.mod.ToType
import typingsJapgolly.copyWebpackPlugin.mod.TransformerCacheObject
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.webpack.mod.WebpackLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with TransformerCacheObject {
    
    def keys(defaultCacheKeys: StringDictionary[Any], absoluteFilename: String): js.Promise[StringDictionary[Any]]
  }
  object `0` {
    
    inline def apply(keys: (StringDictionary[Any], String) => js.Promise[StringDictionary[Any]]): `0` = {
      val __obj = js.Dynamic.literal(keys = js.Any.fromFunction2(keys))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setKeys(value: (StringDictionary[Any], String) => js.Promise[StringDictionary[Any]]): Self = StObject.set(x, "keys", js.Any.fromFunction2(value))
    }
  }
  
  trait AbsoluteFilename extends StObject {
    
    var absoluteFilename: String
    
    var filename: String
    
    var sourceFilename: String
    
    var toType: ToType
  }
  object AbsoluteFilename {
    
    inline def apply(absoluteFilename: String, filename: String, sourceFilename: String, toType: ToType): AbsoluteFilename = {
      val __obj = js.Dynamic.literal(absoluteFilename = absoluteFilename.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], sourceFilename = sourceFilename.asInstanceOf[js.Any], toType = toType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteFilename]
    }
    
    extension [Self <: AbsoluteFilename](x: Self) {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setToType(value: ToType): Self = StObject.set(x, "toType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    var absoluteFilename: js.UndefOr[String] = js.undefined
    
    var context: String
  }
  object Context {
    
    inline def apply(context: String): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteFilenameUndefined: Self = StObject.set(x, "absoluteFilename", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var absoluteFilename: String
    
    var data: Buffer
    
    var sourceFilename: String
  }
  object Data {
    
    inline def apply(absoluteFilename: String, data: Buffer, sourceFilename: String): Data = {
      val __obj = js.Dynamic.literal(absoluteFilename = absoluteFilename.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sourceFilename = sourceFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: String): WebpackLogger = js.native
    def apply(name: js.Function0[String]): WebpackLogger = js.native
  }
  
  trait Keys
    extends StObject
       with TransformerCacheObject {
    
    var keys: StringDictionary[Any]
  }
  object Keys {
    
    inline def apply(keys: StringDictionary[Any]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setKeys(value: StringDictionary[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
}
