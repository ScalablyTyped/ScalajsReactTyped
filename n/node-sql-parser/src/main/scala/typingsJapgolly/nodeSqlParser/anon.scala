package typingsJapgolly.nodeSqlParser

import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.Equalssign
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.`using`
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.algorithm
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.alter
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.btree
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.copy
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.default
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.exclusive
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.hash
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.inplace
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.instant
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.like
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.lock
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.none
import typingsJapgolly.nodeSqlParser.nodeSqlParserStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: default | instant | inplace | copy
    
    var keyword: algorithm
    
    var resource: algorithm
    
    var symbol: Equalssign | Null
    
    var `type`: alter
  }
  object Algorithm {
    
    inline def apply(algorithm: default | instant | inplace | copy): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], keyword = "algorithm", resource = "algorithm", symbol = null)
      __obj.updateDynamic("type")("alter")
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: default | instant | inplace | copy): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: algorithm): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setResource(value: algorithm): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Equalssign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
      
      inline def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Db extends StObject {
    
    var db: String
    
    var table: String
  }
  object Db {
    
    inline def apply(db: String, table: String): Db = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Db]
    }
    
    extension [Self <: Db](x: Self) {
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keyword extends StObject {
    
    var keyword: `using`
    
    var `type`: btree | hash
  }
  object Keyword {
    
    inline def apply(`type`: btree | hash): Keyword = {
      val __obj = js.Dynamic.literal(keyword = "using")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyword]
    }
    
    extension [Self <: Keyword](x: Self) {
      
      inline def setKeyword(value: `using`): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setType(value: btree | hash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lock extends StObject {
    
    var keyword: lock
    
    var lock: default | none | shared | exclusive
    
    var resource: lock
    
    var symbol: Equalssign | Null
    
    var `type`: alter
  }
  object Lock {
    
    inline def apply(lock: default | none | shared | exclusive): Lock = {
      val __obj = js.Dynamic.literal(keyword = "lock", lock = lock.asInstanceOf[js.Any], resource = "lock", symbol = null)
      __obj.updateDynamic("type")("alter")
      __obj.asInstanceOf[Lock]
    }
    
    extension [Self <: Lock](x: Self) {
      
      inline def setKeyword(value: lock): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLock(value: default | none | shared | exclusive): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setResource(value: lock): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Equalssign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
      
      inline def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parentheses extends StObject {
    
    var parentheses: js.UndefOr[Boolean] = js.undefined
    
    var table: String
    
    var `type`: like
  }
  object Parentheses {
    
    inline def apply(table: String): Parentheses = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("like")
      __obj.asInstanceOf[Parentheses]
    }
    
    extension [Self <: Parentheses](x: Self) {
      
      inline def setParentheses(value: Boolean): Self = StObject.set(x, "parentheses", value.asInstanceOf[js.Any])
      
      inline def setParenthesesUndefined: Self = StObject.set(x, "parentheses", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setType(value: like): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
