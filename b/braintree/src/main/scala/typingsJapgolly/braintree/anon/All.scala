package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.braintreeStrings.Discover
import typingsJapgolly.braintree.braintreeStrings.Elo
import typingsJapgolly.braintree.braintreeStrings.JCB
import typingsJapgolly.braintree.braintreeStrings.Laser
import typingsJapgolly.braintree.braintreeStrings.Maestro
import typingsJapgolly.braintree.braintreeStrings.MasterCard
import typingsJapgolly.braintree.braintreeStrings.Solo
import typingsJapgolly.braintree.braintreeStrings.Switch
import typingsJapgolly.braintree.braintreeStrings.Unknown
import typingsJapgolly.braintree.braintreeStrings.Visa
import typingsJapgolly.braintree.braintreeStrings.`American Express`
import typingsJapgolly.braintree.braintreeStrings.`Carte Blanche`
import typingsJapgolly.braintree.braintreeStrings.`China UnionPay`
import typingsJapgolly.braintree.braintreeStrings.`Diners Club`
import typingsJapgolly.braintree.braintreeStrings.`UK Maestro`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  def All(): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
  ]
  
  var AmEx: `American Express`
  
  var CarteBlanche: `Carte Blanche`
  
  var ChinaUnionPay: `China UnionPay`
  
  var DinersClubInternational: `Diners Club`
  
  var Discover: typingsJapgolly.braintree.braintreeStrings.Discover
  
  var Elo: typingsJapgolly.braintree.braintreeStrings.Elo
  
  var JCB: typingsJapgolly.braintree.braintreeStrings.JCB
  
  var Laser: typingsJapgolly.braintree.braintreeStrings.Laser
  
  var Maestro: typingsJapgolly.braintree.braintreeStrings.Maestro
  
  var MasterCard: typingsJapgolly.braintree.braintreeStrings.MasterCard
  
  var Solo: typingsJapgolly.braintree.braintreeStrings.Solo
  
  var Switch: typingsJapgolly.braintree.braintreeStrings.Switch
  
  var UKMaestro: `UK Maestro`
  
  var Unknown: typingsJapgolly.braintree.braintreeStrings.Unknown
  
  var Visa: typingsJapgolly.braintree.braintreeStrings.Visa
}
object All {
  
  inline def apply(
    All: CallbackTo[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
      ]
    ]
  ): All = {
    val __obj = js.Dynamic.literal(All = All.toJsFn, AmEx = "American Express", CarteBlanche = "Carte Blanche", ChinaUnionPay = "China UnionPay", DinersClubInternational = "Diners Club", Discover = "Discover", Elo = "Elo", JCB = "JCB", Laser = "Laser", Maestro = "Maestro", MasterCard = "MasterCard", Solo = "Solo", Switch = "Switch", UKMaestro = "UK Maestro", Unknown = "Unknown", Visa = "Visa")
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(
      value: CallbackTo[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any[keyof std.Omit</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CreditCard.CardType * / any, 'All'>] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "All", value.toJsFn)
    
    inline def setAmEx(value: `American Express`): Self = StObject.set(x, "AmEx", value.asInstanceOf[js.Any])
    
    inline def setCarteBlanche(value: `Carte Blanche`): Self = StObject.set(x, "CarteBlanche", value.asInstanceOf[js.Any])
    
    inline def setChinaUnionPay(value: `China UnionPay`): Self = StObject.set(x, "ChinaUnionPay", value.asInstanceOf[js.Any])
    
    inline def setDinersClubInternational(value: `Diners Club`): Self = StObject.set(x, "DinersClubInternational", value.asInstanceOf[js.Any])
    
    inline def setDiscover(value: Discover): Self = StObject.set(x, "Discover", value.asInstanceOf[js.Any])
    
    inline def setElo(value: Elo): Self = StObject.set(x, "Elo", value.asInstanceOf[js.Any])
    
    inline def setJCB(value: JCB): Self = StObject.set(x, "JCB", value.asInstanceOf[js.Any])
    
    inline def setLaser(value: Laser): Self = StObject.set(x, "Laser", value.asInstanceOf[js.Any])
    
    inline def setMaestro(value: Maestro): Self = StObject.set(x, "Maestro", value.asInstanceOf[js.Any])
    
    inline def setMasterCard(value: MasterCard): Self = StObject.set(x, "MasterCard", value.asInstanceOf[js.Any])
    
    inline def setSolo(value: Solo): Self = StObject.set(x, "Solo", value.asInstanceOf[js.Any])
    
    inline def setSwitch(value: Switch): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
    
    inline def setUKMaestro(value: `UK Maestro`): Self = StObject.set(x, "UKMaestro", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setVisa(value: Visa): Self = StObject.set(x, "Visa", value.asInstanceOf[js.Any])
  }
}
