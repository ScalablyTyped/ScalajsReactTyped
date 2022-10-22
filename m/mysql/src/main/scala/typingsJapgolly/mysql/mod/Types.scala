package typingsJapgolly.mysql.mod

import typingsJapgolly.mysql.mysqlInts.`0x00`
import typingsJapgolly.mysql.mysqlInts.`0x01`
import typingsJapgolly.mysql.mysqlInts.`0x02`
import typingsJapgolly.mysql.mysqlInts.`0x03`
import typingsJapgolly.mysql.mysqlInts.`0x04`
import typingsJapgolly.mysql.mysqlInts.`0x05`
import typingsJapgolly.mysql.mysqlInts.`0x06`
import typingsJapgolly.mysql.mysqlInts.`0x07`
import typingsJapgolly.mysql.mysqlInts.`0x08`
import typingsJapgolly.mysql.mysqlInts.`0x09`
import typingsJapgolly.mysql.mysqlInts.`0x0a`
import typingsJapgolly.mysql.mysqlInts.`0x0b`
import typingsJapgolly.mysql.mysqlInts.`0x0c`
import typingsJapgolly.mysql.mysqlInts.`0x0d`
import typingsJapgolly.mysql.mysqlInts.`0x0e`
import typingsJapgolly.mysql.mysqlInts.`0x0f`
import typingsJapgolly.mysql.mysqlInts.`0x10`
import typingsJapgolly.mysql.mysqlInts.`0x11`
import typingsJapgolly.mysql.mysqlInts.`0x12`
import typingsJapgolly.mysql.mysqlInts.`0x13`
import typingsJapgolly.mysql.mysqlInts.`0xf5`
import typingsJapgolly.mysql.mysqlInts.`0xf6`
import typingsJapgolly.mysql.mysqlInts.`0xf7`
import typingsJapgolly.mysql.mysqlInts.`0xf8`
import typingsJapgolly.mysql.mysqlInts.`0xf9`
import typingsJapgolly.mysql.mysqlInts.`0xfa`
import typingsJapgolly.mysql.mysqlInts.`0xfb`
import typingsJapgolly.mysql.mysqlInts.`0xfc`
import typingsJapgolly.mysql.mysqlInts.`0xfd`
import typingsJapgolly.mysql.mysqlInts.`0xfe`
import typingsJapgolly.mysql.mysqlInts.`0xff`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mysql.mysqlInts.`0x00`
  - typingsJapgolly.mysql.mysqlInts.`0x01`
  - typingsJapgolly.mysql.mysqlInts.`0x02`
  - typingsJapgolly.mysql.mysqlInts.`0x03`
  - typingsJapgolly.mysql.mysqlInts.`0x04`
  - typingsJapgolly.mysql.mysqlInts.`0x05`
  - typingsJapgolly.mysql.mysqlInts.`0x06`
  - typingsJapgolly.mysql.mysqlInts.`0x07`
  - typingsJapgolly.mysql.mysqlInts.`0x08`
  - typingsJapgolly.mysql.mysqlInts.`0x09`
  - typingsJapgolly.mysql.mysqlInts.`0x0a`
  - typingsJapgolly.mysql.mysqlInts.`0x0b`
  - typingsJapgolly.mysql.mysqlInts.`0x0c`
  - typingsJapgolly.mysql.mysqlInts.`0x0d`
  - typingsJapgolly.mysql.mysqlInts.`0x0e`
  - typingsJapgolly.mysql.mysqlInts.`0x0f`
  - typingsJapgolly.mysql.mysqlInts.`0x10`
  - typingsJapgolly.mysql.mysqlInts.`0x11`
  - typingsJapgolly.mysql.mysqlInts.`0x12`
  - typingsJapgolly.mysql.mysqlInts.`0x13`
  - typingsJapgolly.mysql.mysqlInts.`0xf5`
  - typingsJapgolly.mysql.mysqlInts.`0xf6`
  - typingsJapgolly.mysql.mysqlInts.`0xf7`
  - typingsJapgolly.mysql.mysqlInts.`0xf8`
  - typingsJapgolly.mysql.mysqlInts.`0xf9`
  - typingsJapgolly.mysql.mysqlInts.`0xfa`
  - typingsJapgolly.mysql.mysqlInts.`0xfb`
  - typingsJapgolly.mysql.mysqlInts.`0xfc`
  - typingsJapgolly.mysql.mysqlInts.`0xfd`
  - typingsJapgolly.mysql.mysqlInts.`0xfe`
  - typingsJapgolly.mysql.mysqlInts.`0xff`
*/
trait Types extends StObject
object Types {
  
  // aka VARCHAR (?)
  inline def BIT: `0x10` = 0x10.asInstanceOf[`0x10`]
  
  // aka LONGBLOG, LONGTEXT
  inline def BLOB: `0xfc` = 0xfc.asInstanceOf[`0xfc`]
  
  // aka MEDIUMINT, 3 bytes
  inline def DATE: `0x0a` = 0x0a.asInstanceOf[`0x0a`]
  
  // aka TIME
  inline def DATETIME: `0x0c` = 0x0c.asInstanceOf[`0x0c`]
  
  // aka TIMESTAMP with fractional seconds
  inline def DATETIME2: `0x12` = 0x12.asInstanceOf[`0x12`]
  
  inline def DECIMAL: `0x00` = 0x00.asInstanceOf[`0x00`]
  
  // aka FLOAT, 4-8 bytes
  inline def DOUBLE: `0x05` = 0x05.asInstanceOf[`0x05`]
  
  // aka DECIMAL
  inline def ENUM: `0xf7` = 0xf7.asInstanceOf[`0xf7`]
  
  // aka INT, 4 bytes
  inline def FLOAT: `0x04` = 0x04.asInstanceOf[`0x04`]
  
  // aka CHAR, BINARY
  inline def GEOMETRY: `0xff` = 0xff.asInstanceOf[`0xff`]
  
  // aka BIGINT, 8 bytes
  inline def INT24: `0x09` = 0x09.asInstanceOf[`0x09`]
  
  // aka TIME with fractional seconds
  inline def JSON: `0xf5` = 0xf5.asInstanceOf[`0xf5`]
  
  // aka SMALLINT, 2 bytes
  inline def LONG: `0x03` = 0x03.asInstanceOf[`0x03`]
  
  // aka TIMESTAMP
  inline def LONGLONG: `0x08` = 0x08.asInstanceOf[`0x08`]
  
  // aka MEDIUMBLOB, MEDIUMTEXT
  inline def LONG_BLOB: `0xfb` = 0xfb.asInstanceOf[`0xfb`]
  
  // aka TINYBLOB, TINYTEXT
  inline def MEDIUM_BLOB: `0xfa` = 0xfa.asInstanceOf[`0xfa`]
  
  // aka YEAR, 1 byte (don't ask)
  inline def NEWDATE: `0x0e` = 0x0e.asInstanceOf[`0x0e`]
  
  // aka JSON
  inline def NEWDECIMAL: `0xf6` = 0xf6.asInstanceOf[`0xf6`]
  
  // aka DOUBLE, 8 bytes
  inline def NULL: `0x06` = 0x06.asInstanceOf[`0x06`]
  
  // aka ENUM
  inline def SET: `0xf8` = 0xf8.asInstanceOf[`0xf8`]
  
  // aka TINYINT, 1 byte
  inline def SHORT: `0x02` = 0x02.asInstanceOf[`0x02`]
  
  // aka VARCHAR, VARBINARY
  inline def STRING: `0xfe` = 0xfe.asInstanceOf[`0xfe`]
  
  // aka DATE
  inline def TIME: `0x0b` = 0x0b.asInstanceOf[`0x0b`]
  
  // aka DATETIME with fractional seconds
  inline def TIME2: `0x13` = 0x13.asInstanceOf[`0x13`]
  
  // NULL (used for prepared statements, I think)
  inline def TIMESTAMP: `0x07` = 0x07.asInstanceOf[`0x07`]
  
  // aka BIT, 1-8 byte
  inline def TIMESTAMP2: `0x11` = 0x11.asInstanceOf[`0x11`]
  
  // aka DECIMAL (http://dev.mysql.com/doc/refman/5.0/en/precision-math-decimal-changes.html)
  inline def TINY: `0x01` = 0x01.asInstanceOf[`0x01`]
  
  // aka SET
  inline def TINY_BLOB: `0xf9` = 0xf9.asInstanceOf[`0xf9`]
  
  // aka ?
  inline def VARCHAR: `0x0f` = 0x0f.asInstanceOf[`0x0f`]
  
  // aka BLOB, TEXT
  inline def VAR_STRING: `0xfd` = 0xfd.asInstanceOf[`0xfd`]
  
  // aka DATETIME
  inline def YEAR: `0x0d` = 0x0d.asInstanceOf[`0x0d`]
}
