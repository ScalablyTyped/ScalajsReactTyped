package typingsJapgolly.minappEnv.global

import typingsJapgolly.minappEnv.DB.DatabaseCommand
import typingsJapgolly.minappEnv.DB.IQueryCondition
import typingsJapgolly.minappEnv.DB.IServerDateOptions
import typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL
import typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL
import typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL
import typingsJapgolly.minappEnv.IAPIParam
import typingsJapgolly.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === Database ===
object DB {
  
  @JSGlobal("DB.APIBaseContract")
  @js.native
  open class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[Any] */, CONTEXT] ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] {
    
    /**
      * In case of callback-style invocation, this function will be called
      */
    /* CompleteClass */
    override def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN = js.native
    
    /* CompleteClass */
    override def getContext(param: PARAM): CONTEXT = js.native
    
    /* CompleteClass */
    override def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T = js.native
    
    /* CompleteClass */
    override def run[T /* <: PARAM */](param: T): typingsJapgolly.minappEnv.Promise[PROMISE_RETURN] = js.native
  }
  
  @JSGlobal("DB.Batch")
  @js.native
  open class Batch ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.Batch
  
  @JSGlobal("DB.CollectionReference")
  @js.native
  open class CollectionReference protected ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.CollectionReference {
    /* private */ def this(name: java.lang.String, database: typingsJapgolly.minappEnv.DB.Database) = this()
  }
  
  @JSGlobal("DB.Database")
  @js.native
  /* private */ open class Database ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.Database {
    
    /* CompleteClass */
    override val Geo: typingsJapgolly.minappEnv.DB.Geo = js.native
    
    /* CompleteClass */
    override def collection(collectionName: java.lang.String): typingsJapgolly.minappEnv.DB.CollectionReference = js.native
    
    /* CompleteClass */
    override val command: DatabaseCommand = js.native
    
    /* CompleteClass */
    override val config: ICloudConfig = js.native
    
    /* CompleteClass */
    override def serverDate(): typingsJapgolly.minappEnv.DB.ServerDate = js.native
  }
  
  @JSGlobal("DB.DatabaseLogicCommand")
  @js.native
  open class DatabaseLogicCommand ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.DatabaseLogicCommand {
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def and(expressions: (typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typingsJapgolly.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    var operands: typingsJapgolly.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    
    /* CompleteClass */
    override def or(expressions: (typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @JSGlobal("DB.DatabaseQueryCommand")
  @js.native
  open class DatabaseQueryCommand ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.DatabaseQueryCommand {
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def and(expressions: (typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typingsJapgolly.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    override def gt(`val`: Any): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def gte(`val`: Any): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def in(`val`: typingsJapgolly.minappEnv.Array[Any]): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def lt(`val`: Any): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def lte(`val`: Any): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def neq(`val`: Any): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def nin(`val`: typingsJapgolly.minappEnv.Array[Any]): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var operands: typingsJapgolly.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    /* CompleteClass */
    @JSName("operator")
    var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | java.lang.String = js.native
    
    /* CompleteClass */
    override def or(expressions: (typingsJapgolly.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typingsJapgolly.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @JSGlobal("DB.DatabaseUpdateCommand")
  @js.native
  open class DatabaseUpdateCommand protected ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.DatabaseUpdateCommand {
    def this(operator: UPDATE_COMMANDS_LITERAL, operands: typingsJapgolly.minappEnv.Array[Any]) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typingsJapgolly.minappEnv.Array[Any],
      fieldName: java.lang.String
    ) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typingsJapgolly.minappEnv.Array[Any],
      fieldName: typingsJapgolly.minappEnv.InternalSymbol
    ) = this()
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typingsJapgolly.minappEnv.DB.DatabaseUpdateCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typingsJapgolly.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    var operands: typingsJapgolly.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: UPDATE_COMMANDS_LITERAL = js.native
  }
  
  @JSGlobal("DB.DocumentReference")
  @js.native
  open class DocumentReference protected ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.DocumentReference {
    /* private */ def this(docId: java.lang.String, database: typingsJapgolly.minappEnv.DB.Database) = this()
    /* private */ def this(docId: Double, database: typingsJapgolly.minappEnv.DB.Database) = this()
  }
  
  /* note: abstract class */ @JSGlobal("DB.GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.GeoPoint {
    def this(longitude: Double, latitude: Double) = this()
    
    /* CompleteClass */
    var latitude: Double = js.native
    
    /* CompleteClass */
    var longitude: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
  @js.native
  object LOGIC_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "and" */ val AND: typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL.AND & java.lang.String = js.native
    
    /* "nor" */ val NOR: typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOR & java.lang.String = js.native
    
    /* "not" */ val NOT: typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOT & java.lang.String = js.native
    
    /* "or" */ val OR: typingsJapgolly.minappEnv.DB.LOGIC_COMMANDS_LITERAL.OR & java.lang.String = js.native
  }
  
  @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
  @js.native
  object QUERY_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "eq" */ val EQ: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.EQ & java.lang.String = js.native
    
    /* "gt" */ val GT: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.GT & java.lang.String = js.native
    
    /* "gte" */ val GTE: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.GTE & java.lang.String = js.native
    
    /* "in" */ val IN: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.IN & java.lang.String = js.native
    
    /* "lt" */ val LT: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.LT & java.lang.String = js.native
    
    /* "lte" */ val LTE: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.LTE & java.lang.String = js.native
    
    /* "neq" */ val NEQ: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.NEQ & java.lang.String = js.native
    
    /* "nin" */ val NIN: typingsJapgolly.minappEnv.DB.QUERY_COMMANDS_LITERAL.NIN & java.lang.String = js.native
  }
  
  @JSGlobal("DB.Query")
  @js.native
  open class Query ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.Query
  
  /* note: abstract class */ @JSGlobal("DB.ServerDate")
  @js.native
  open class ServerDate ()
    extends StObject
       with typingsJapgolly.minappEnv.DB.ServerDate {
    def this(options: IServerDateOptions) = this()
    
    /* CompleteClass */
    override val options: IServerDateOptions = js.native
  }
  
  @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
  @js.native
  object UPDATE_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "inc" */ val INC: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.INC & java.lang.String = js.native
    
    /* "mul" */ val MUL: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.MUL & java.lang.String = js.native
    
    /* "pop" */ val POP: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.POP & java.lang.String = js.native
    
    /* "push" */ val PUSH: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.PUSH & java.lang.String = js.native
    
    /* "remove" */ val REMOVE: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.REMOVE & java.lang.String = js.native
    
    /* "set" */ val SET: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SET & java.lang.String = js.native
    
    /* "shift" */ val SHIFT: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SHIFT & java.lang.String = js.native
    
    /* "unshift" */ val UNSHIFT: typingsJapgolly.minappEnv.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT & java.lang.String = js.native
  }
}
