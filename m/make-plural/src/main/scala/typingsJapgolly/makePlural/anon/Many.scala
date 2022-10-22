package typingsJapgolly.makePlural.anon

import typingsJapgolly.makePlural.makePluralStrings.`1000000`
import typingsJapgolly.makePlural.makePluralStrings.`100000`
import typingsJapgolly.makePlural.makePluralStrings.`10000`
import typingsJapgolly.makePlural.makePluralStrings.`1000`
import typingsJapgolly.makePlural.makePluralStrings.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Many extends StObject {
  
  var few: js.Array[typingsJapgolly.makePlural.makePluralStrings.`4`]
  
  var many: js.Array[typingsJapgolly.makePlural.makePluralStrings.`6`]
  
  var one: js.Tuple4[
    typingsJapgolly.makePlural.makePluralStrings.`1`, 
    typingsJapgolly.makePlural.makePluralStrings.`5`, 
    typingsJapgolly.makePlural.makePluralStrings.`7`, 
    typingsJapgolly.makePlural.makePluralStrings.`10`
  ]
  
  var other: js.Tuple8[
    typingsJapgolly.makePlural.makePluralStrings.`0`, 
    typingsJapgolly.makePlural.makePluralStrings.`11`, 
    typingsJapgolly.makePlural.makePluralStrings.`25`, 
    `100`, 
    `1000`, 
    `10000`, 
    `100000`, 
    `1000000`
  ]
  
  var two: js.Tuple2[
    typingsJapgolly.makePlural.makePluralStrings.`2`, 
    typingsJapgolly.makePlural.makePluralStrings.`3`
  ]
}
object Many {
  
  inline def apply(
    few: js.Array[typingsJapgolly.makePlural.makePluralStrings.`4`],
    many: js.Array[typingsJapgolly.makePlural.makePluralStrings.`6`],
    one: js.Tuple4[
      typingsJapgolly.makePlural.makePluralStrings.`1`, 
      typingsJapgolly.makePlural.makePluralStrings.`5`, 
      typingsJapgolly.makePlural.makePluralStrings.`7`, 
      typingsJapgolly.makePlural.makePluralStrings.`10`
    ],
    other: js.Tuple8[
      typingsJapgolly.makePlural.makePluralStrings.`0`, 
      typingsJapgolly.makePlural.makePluralStrings.`11`, 
      typingsJapgolly.makePlural.makePluralStrings.`25`, 
      `100`, 
      `1000`, 
      `10000`, 
      `100000`, 
      `1000000`
    ],
    two: js.Tuple2[
      typingsJapgolly.makePlural.makePluralStrings.`2`, 
      typingsJapgolly.makePlural.makePluralStrings.`3`
    ]
  ): Many = {
    val __obj = js.Dynamic.literal(few = few.asInstanceOf[js.Any], many = many.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], two = two.asInstanceOf[js.Any])
    __obj.asInstanceOf[Many]
  }
  
  extension [Self <: Many](x: Self) {
    
    inline def setFew(value: js.Array[typingsJapgolly.makePlural.makePluralStrings.`4`]): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
    
    inline def setFewVarargs(value: typingsJapgolly.makePlural.makePluralStrings.`4`*): Self = StObject.set(x, "few", js.Array(value*))
    
    inline def setMany(value: js.Array[typingsJapgolly.makePlural.makePluralStrings.`6`]): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyVarargs(value: typingsJapgolly.makePlural.makePluralStrings.`6`*): Self = StObject.set(x, "many", js.Array(value*))
    
    inline def setOne(
      value: js.Tuple4[
          typingsJapgolly.makePlural.makePluralStrings.`1`, 
          typingsJapgolly.makePlural.makePluralStrings.`5`, 
          typingsJapgolly.makePlural.makePluralStrings.`7`, 
          typingsJapgolly.makePlural.makePluralStrings.`10`
        ]
    ): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    inline def setOther(
      value: js.Tuple8[
          typingsJapgolly.makePlural.makePluralStrings.`0`, 
          typingsJapgolly.makePlural.makePluralStrings.`11`, 
          typingsJapgolly.makePlural.makePluralStrings.`25`, 
          `100`, 
          `1000`, 
          `10000`, 
          `100000`, 
          `1000000`
        ]
    ): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setTwo(
      value: js.Tuple2[
          typingsJapgolly.makePlural.makePluralStrings.`2`, 
          typingsJapgolly.makePlural.makePluralStrings.`3`
        ]
    ): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
  }
}
