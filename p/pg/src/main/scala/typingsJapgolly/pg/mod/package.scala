package typingsJapgolly.pg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pg.anon.TypeofPg
import typingsJapgolly.pg.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def defaults: Defaults_ & ClientConfig = ^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[Defaults_ & ClientConfig]

inline def native: TypeofPg | Null = ^.asInstanceOf[js.Dynamic].selectDynamic("native").asInstanceOf[TypeofPg | Null]

type ConnectionConfig = ClientConfig

type QueryResultRow = StringDictionary[Any]
