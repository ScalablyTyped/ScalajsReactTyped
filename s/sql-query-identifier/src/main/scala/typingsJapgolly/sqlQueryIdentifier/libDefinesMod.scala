package typingsJapgolly.sqlQueryIdentifier

import typingsJapgolly.sqlQueryIdentifier.anon.AcceptTokens
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.QUERY
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.`comment-block`
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.`comment-inline`
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.bigquery
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.generic
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.keyword
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.mssql
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.mysql
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.oracle
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.parameter
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.psql
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.semicolon
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.sqlite
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.string
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.unknown_
import typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefinesMod {
  
  @JSImport("sql-query-identifier/lib/defines", "DIALECTS")
  @js.native
  val DIALECTS: js.Tuple7[mssql, sqlite, mysql, oracle, psql, bigquery, generic] = js.native
  
  trait ConcreteStatement
    extends StObject
       with Statement {
    
    @JSName("executionType")
    var executionType_ConcreteStatement: ExecutionType
    
    @JSName("type")
    var type_ConcreteStatement: StatementType
  }
  object ConcreteStatement {
    
    inline def apply(
      end: Double,
      executionType: ExecutionType,
      parameters: js.Array[String],
      start: Double,
      `type`: StatementType
    ): ConcreteStatement = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteStatement]
    }
    
    extension [Self <: ConcreteStatement](x: Self) {
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.mssql
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.sqlite
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.mysql
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.oracle
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.psql
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.bigquery
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.generic
  */
  trait Dialect extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
  */
  trait ExecutionType extends StObject
  object ExecutionType {
    
    inline def ANON_BLOCK: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK = "ANON_BLOCK".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK]
    
    inline def LISTING: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING = "LISTING".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING]
    
    inline def MODIFICATION: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION = "MODIFICATION".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION]
    
    inline def UNKNOWN: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN]
  }
  
  trait IdentifyOptions extends StObject {
    
    var dialect: js.UndefOr[Dialect] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object IdentifyOptions {
    
    inline def apply(): IdentifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentifyOptions]
    }
    
    extension [Self <: IdentifyOptions](x: Self) {
      
      inline def setDialect(value: Dialect): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait IdentifyResult extends StObject {
    
    var end: Double
    
    var executionType: ExecutionType
    
    var parameters: js.Array[String]
    
    var start: Double
    
    var text: String
    
    var `type`: StatementType
  }
  object IdentifyResult {
    
    inline def apply(
      end: Double,
      executionType: ExecutionType,
      parameters: js.Array[String],
      start: Double,
      text: String,
      `type`: StatementType
    ): IdentifyResult = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifyResult]
    }
    
    extension [Self <: IdentifyResult](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResult extends StObject {
    
    var body: js.Array[ConcreteStatement]
    
    var end: Double
    
    var start: Double
    
    var tokens: js.Array[Token]
    
    var `type`: QUERY
  }
  object ParseResult {
    
    inline def apply(body: js.Array[ConcreteStatement], end: Double, start: Double, tokens: js.Array[Token]): ParseResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("QUERY")
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setBody(value: js.Array[ConcreteStatement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: ConcreteStatement*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var end: Double
    
    var input: String
    
    var position: Double
    
    var start: Double
  }
  object State {
    
    inline def apply(end: Double, input: String, position: Double, start: Double): State = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Statement extends StObject {
    
    var algorithm: js.UndefOr[Double] = js.undefined
    
    var canEnd: js.UndefOr[Boolean] = js.undefined
    
    var definer: js.UndefOr[Double] = js.undefined
    
    var end: Double
    
    var endStatement: js.UndefOr[String] = js.undefined
    
    var executionType: js.UndefOr[ExecutionType] = js.undefined
    
    var parameters: js.Array[String]
    
    var sqlSecurity: js.UndefOr[Double] = js.undefined
    
    var start: Double
    
    var `type`: js.UndefOr[StatementType] = js.undefined
  }
  object Statement {
    
    inline def apply(end: Double, parameters: js.Array[String], start: Double): Statement = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statement]
    }
    
    extension [Self <: Statement](x: Self) {
      
      inline def setAlgorithm(value: Double): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCanEnd(value: Boolean): Self = StObject.set(x, "canEnd", value.asInstanceOf[js.Any])
      
      inline def setCanEndUndefined: Self = StObject.set(x, "canEnd", js.undefined)
      
      inline def setDefiner(value: Double): Self = StObject.set(x, "definer", value.asInstanceOf[js.Any])
      
      inline def setDefinerUndefined: Self = StObject.set(x, "definer", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndStatement(value: String): Self = StObject.set(x, "endStatement", value.asInstanceOf[js.Any])
      
      inline def setEndStatementUndefined: Self = StObject.set(x, "endStatement", js.undefined)
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setExecutionTypeUndefined: Self = StObject.set(x, "executionType", js.undefined)
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setSqlSecurity(value: Double): Self = StObject.set(x, "sqlSecurity", value.asInstanceOf[js.Any])
      
      inline def setSqlSecurityUndefined: Self = StObject.set(x, "sqlSecurity", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK
    - typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
  */
  trait StatementType extends StObject
  object StatementType {
    
    inline def ALTER_DATABASE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE = "ALTER_DATABASE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE]
    
    inline def ALTER_FUNCTION: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION = "ALTER_FUNCTION".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION]
    
    inline def ALTER_INDEX: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX = "ALTER_INDEX".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX]
    
    inline def ALTER_PROCEDURE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE = "ALTER_PROCEDURE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE]
    
    inline def ALTER_SCHEMA: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA = "ALTER_SCHEMA".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA]
    
    inline def ALTER_TABLE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE = "ALTER_TABLE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE]
    
    inline def ALTER_TRIGGER: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER = "ALTER_TRIGGER".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER]
    
    inline def ALTER_VIEW: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW = "ALTER_VIEW".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW]
    
    inline def ANON_BLOCK: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK = "ANON_BLOCK".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK]
    
    inline def CREATE_DATABASE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE]
    
    inline def CREATE_FUNCTION: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION = "CREATE_FUNCTION".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION]
    
    inline def CREATE_INDEX: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX = "CREATE_INDEX".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX]
    
    inline def CREATE_PROCEDURE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE = "CREATE_PROCEDURE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE]
    
    inline def CREATE_SCHEMA: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA = "CREATE_SCHEMA".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA]
    
    inline def CREATE_TABLE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE = "CREATE_TABLE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE]
    
    inline def CREATE_TRIGGER: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER = "CREATE_TRIGGER".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER]
    
    inline def CREATE_VIEW: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW = "CREATE_VIEW".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW]
    
    inline def DELETE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE]
    
    inline def DROP_DATABASE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE = "DROP_DATABASE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE]
    
    inline def DROP_FUNCTION: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION = "DROP_FUNCTION".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION]
    
    inline def DROP_INDEX: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX = "DROP_INDEX".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX]
    
    inline def DROP_PROCEDURE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE = "DROP_PROCEDURE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE]
    
    inline def DROP_SCHEMA: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA = "DROP_SCHEMA".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA]
    
    inline def DROP_TABLE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE = "DROP_TABLE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE]
    
    inline def DROP_TRIGGER: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER = "DROP_TRIGGER".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER]
    
    inline def DROP_VIEW: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW = "DROP_VIEW".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW]
    
    inline def INSERT: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT = "INSERT".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT]
    
    inline def SELECT: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT = "SELECT".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT]
    
    inline def TRUNCATE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE = "TRUNCATE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE]
    
    inline def UNKNOWN: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN]
    
    inline def UPDATE: typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE = "UPDATE".asInstanceOf[typingsJapgolly.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE]
  }
  
  @js.native
  trait Step extends StObject {
    
    def add(token: Token): Unit = js.native
    
    def postCanGoToNext(): Boolean = js.native
    def postCanGoToNext(token: Token): Boolean = js.native
    
    def preCanGoToNext(): Boolean = js.native
    def preCanGoToNext(token: Token): Boolean = js.native
    
    var validation: js.UndefOr[AcceptTokens] = js.native
  }
  
  trait Token extends StObject {
    
    var end: Double
    
    var start: Double
    
    var `type`: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_
    
    var value: String
  }
  object Token {
    
    inline def apply(
      end: Double,
      start: Double,
      `type`: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_,
      value: String
    ): Token = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
