package typingsJapgolly.jsonEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Array extends StObject {
    
    var array: OptionsJSONEditorArrayOptions
    
    var `object`: Options
  }
  object Array {
    
    inline def apply(array: OptionsJSONEditorArrayOptions, `object`: Options): Array = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array]
    }
    
    extension [Self <: Array](x: Self) {
      
      inline def setArray(value: OptionsJSONEditorArrayOptions): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Options): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasePath extends StObject {
    
    var basePath: String
  }
  object BasePath {
    
    inline def apply(basePath: String): BasePath = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePath]
    }
    
    extension [Self <: BasePath](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compile extends StObject {
    
    def compile(template: String): js.Function1[/* vars */ Any, String]
  }
  object Compile {
    
    inline def apply(compile: String => js.Function1[/* vars */ Any, String]): Compile = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
      __obj.asInstanceOf[Compile]
    }
    
    extension [Self <: Compile](x: Self) {
      
      inline def setCompile(value: String => js.Function1[/* vars */ Any, String]): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
    }
  }
  
  trait EmoticonsEnabled extends StObject {
    
    var emoticonsEnabled: Boolean
  }
  object EmoticonsEnabled {
    
    inline def apply(emoticonsEnabled: Boolean): EmoticonsEnabled = {
      val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmoticonsEnabled]
    }
    
    extension [Self <: EmoticonsEnabled](x: Self) {
      
      inline def setEmoticonsEnabled(value: Boolean): Self = StObject.set(x, "emoticonsEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: Boolean
  }
  object Enable {
    
    inline def apply(enable: Boolean): Enable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enable]
    }
    
    extension [Self <: Enable](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: JSONEditorObjectOptions
  }
  object Options {
    
    inline def apply(options: JSONEditorObjectOptions): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: JSONEditorObjectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsJSONEditorArrayOptions extends StObject {
    
    var options: JSONEditorArrayOptions
  }
  object OptionsJSONEditorArrayOptions {
    
    inline def apply(options: JSONEditorArrayOptions): OptionsJSONEditorArrayOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsJSONEditorArrayOptions]
    }
    
    extension [Self <: OptionsJSONEditorArrayOptions](x: Self) {
      
      inline def setOptions(value: JSONEditorArrayOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var theme: String
  }
  object Theme {
    
    inline def apply(theme: String): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
