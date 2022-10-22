package typingsJapgolly.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisSearch.anon.ALGORITHM
import typingsJapgolly.redisSearch.anon.BLOCKSIZE
import typingsJapgolly.redisSearch.anon.BY
import typingsJapgolly.redisSearch.anon.CASESENSITIVE
import typingsJapgolly.redisSearch.anon.EFCONSTRUCTION
import typingsJapgolly.redisSearch.anon.NOINDEX
import typingsJapgolly.redisSearch.anon.NOSTEM
import typingsJapgolly.redisSearch.anon.Type
import typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.GEO
import typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC
import typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.TAG
import typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT
import typingsJapgolly.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR
import typingsJapgolly.redisSearch.distCommandsMod.VectorAlgorithms.FLAT
import typingsJapgolly.redisSearch.distCommandsMod.VectorAlgorithms.HNSW
import typingsJapgolly.redisSearch.distCommandsMod.^
import typingsJapgolly.redisSearch.distCommandsSearchMod.SearchOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def pushArgumentsWithLength(args: RedisCommandArguments, fn: js.Function1[/* args */ RedisCommandArguments, Unit]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArgumentsWithLength")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushParamsArgs(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushParamsArgs")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushParamsArgs(args: RedisCommandArguments, params: Params): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParamsArgs")(args.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSchema(args: RedisCommandArguments, schema: RediSearchSchema): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSchema")(args.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def pushSearchOptions(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushSearchOptions")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushSearchOptions(args: RedisCommandArguments, options: SearchOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSearchOptions")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSortByArguments(args: RedisCommandArguments, name: String, sortBy: js.Array[SortByProperty]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByArguments")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def pushSortByArguments(args: RedisCommandArguments, name: String, sortBy: SortByProperty): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByArguments")(args.asInstanceOf[js.Any], name.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def pushSortByProperty(args: RedisCommandArguments, sortBy: SortByProperty): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSortByProperty")(args.asInstanceOf[js.Any], sortBy.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformProfile(reply: js.Array[Any]): ProfileData = ^.asInstanceOf[js.Dynamic].applyDynamic("transformProfile")(reply.asInstanceOf[js.Any]).asInstanceOf[ProfileData]

type CreateSchemaCommonField[T /* <: SchemaFieldTypes */, E] = CreateSchemaField[T, NOINDEX & E]

type CreateSchemaField[T /* <: SchemaFieldTypes */, E] = T | (Type[T] & E)

type CreateSchemaFlatVectorField = CreateSchemaVectorField[FLAT, BLOCKSIZE]

type CreateSchemaGeoField = CreateSchemaCommonField[GEO, Record[String, scala.Nothing]]

type CreateSchemaHNSWVectorField = CreateSchemaVectorField[HNSW, EFCONSTRUCTION]

type CreateSchemaNumericField = CreateSchemaCommonField[NUMERIC, Record[String, scala.Nothing]]

type CreateSchemaTagField = CreateSchemaCommonField[TAG, CASESENSITIVE]

type CreateSchemaTextField = CreateSchemaCommonField[TEXT, NOSTEM]

type CreateSchemaVectorField[T /* <: VectorAlgorithms */, A /* <: Record[String, Any] */] = CreateSchemaField[VECTOR, ALGORITHM[T] & A]

type Params = Record[String, RedisCommandArgument | Double]

type ProfileRawReply[T] = js.Tuple2[
/* results */ T, 
/* profile */ js.Tuple8[
  /* _ */ String, 
  /* TotalProfileTime */ String, 
  /* _ */ String, 
  /* ParsingTime */ String, 
  /* _ */ String, 
  /* PipelineCreationTime */ String, 
  /* _ */ String, 
  /* IteratorsProfile */ js.Array[Any]
]]

type PropertyName = /* template literal string: ${@|$.}${string} */ String

type RediSearchSchema = StringDictionary[
CreateSchemaTextField | CreateSchemaNumericField | CreateSchemaGeoField | CreateSchemaTagField | CreateSchemaFlatVectorField | CreateSchemaHNSWVectorField]

type SortByProperty = PropertyName | BY
