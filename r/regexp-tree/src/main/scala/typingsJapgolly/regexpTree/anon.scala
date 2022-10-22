package typingsJapgolly.regexpTree

import typingsJapgolly.regexpTree.astMod.AstNodeLocation
import typingsJapgolly.regexpTree.regexpTreeBooleans.`false`
import typingsJapgolly.regexpTree.regexpTreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var asNodes: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setAsNodes(value: `false`): Self = StObject.set(x, "asNodes", value.asInstanceOf[js.Any])
      
      inline def setAsNodesUndefined: Self = StObject.set(x, "asNodes", js.undefined)
    }
  }
  
  trait AsNodes extends StObject {
    
    var asNodes: `true`
  }
  object AsNodes {
    
    inline def apply(): AsNodes = {
      val __obj = js.Dynamic.literal(asNodes = true)
      __obj.asInstanceOf[AsNodes]
    }
    
    extension [Self <: AsNodes](x: Self) {
      
      inline def setAsNodes(value: `true`): Self = StObject.set(x, "asNodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: AstNodeLocation
    
    var source: String
    
    var start: AstNodeLocation
  }
  object End {
    
    inline def apply(end: AstNodeLocation, source: String, start: AstNodeLocation): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: AstNodeLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: AstNodeLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String | Double] = js.undefined
    
    var useLoc: js.UndefOr[Boolean] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String | Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setUseLoc(value: Boolean): Self = StObject.set(x, "useLoc", value.asInstanceOf[js.Any])
      
      inline def setUseLocUndefined: Self = StObject.set(x, "useLoc", js.undefined)
    }
  }
}
