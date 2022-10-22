package typingsJapgolly.ltx

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ltx.anon.ToString
import typingsJapgolly.ltx.anon.TypeofParser
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParserMod {
  
  @JSImport("ltx/src/Parser", JSImport.Default)
  @js.native
  open class default () extends Parser {
    def this(options: ParserOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ltx/src/Parser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ltx/src/Parser", "default.DefaultElement")
    @js.native
    def DefaultElement: Instantiable2[
        /* name */ String, 
        /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
        typingsJapgolly.ltx.srcElementMod.default
      ] = js.native
    inline def DefaultElement_=(
      x: Instantiable2[
          /* name */ String, 
          /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
          typingsJapgolly.ltx.srcElementMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ltx/src/Parser", "default.DefaultParser")
    @js.native
    def DefaultParser: TypeofParser = js.native
    inline def DefaultParser_=(x: TypeofParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultParser")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Parser extends EventEmitter {
    
    def end(data: String): Unit = js.native
    def end(data: ToString): Unit = js.native
    
    def write(data: String): Unit = js.native
    def write(data: ToString): Unit = js.native
  }
  
  trait ParserOptions extends StObject {
    
    var Element: js.UndefOr[
        Instantiable2[
          /* name */ String, 
          /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
          typingsJapgolly.ltx.srcElementMod.default
        ]
      ] = js.undefined
    
    var Parser: js.UndefOr[TypeofParser] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setElement(
        value: Instantiable2[
              /* name */ String, 
              /* attrs */ js.UndefOr[String | StringDictionary[Any]], 
              typingsJapgolly.ltx.srcElementMod.default
            ]
      ): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "Element", js.undefined)
      
      inline def setParser(value: TypeofParser): Self = StObject.set(x, "Parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "Parser", js.undefined)
    }
  }
}
