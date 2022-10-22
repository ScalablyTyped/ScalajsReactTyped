package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A lightweight definiton for orientjs module, Official node.js driver for OrientDB.
  *
  * @param {orientjs.ServerConfig} config
  * @returns {orientjs.OServer}
  */
inline def apply(config: ServerConfig): OServer = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[OServer]

type ODocument = ORecord

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.orientjs.mod.ORawExpression
  - typingsJapgolly.orientjs.mod.OSqlFunction
*/
type OSqlExpression = _OSqlExpression | String

type Version = Double | String
