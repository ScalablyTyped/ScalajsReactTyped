package typingsJapgolly.tzOffset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tz-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def offsetOf(timezone: Timezone): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetOf")(timezone.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeOffset(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def timeAt(date: js.Date, timezone: Timezone): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("timeAt")(date.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPago_Pago
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMidway
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashHonolulu
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashJuneau
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashTijuana
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPhoenix
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChihuahua
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMazatlan
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashDenver
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuatemala
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChicago
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMexico_City
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMonterrey
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashRegina
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashBogota
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashNew_York
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLima
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashHalifax
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashCaracas
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuyana
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSantiago
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGodthab
    - typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMontevideo
    - typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia
    - typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashAzores
    - typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCasablanca
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLondon
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLisbon
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashMonrovia
    - typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashUTC
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBelgrade
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBerlin
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZurich
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBratislava
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBrussels
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBudapest
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashDublin
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLjubljana
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMadrid
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashParis
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashPrague
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRome
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSarajevo
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSkopje
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashStockholm
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVienna
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashWarsaw
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashAlgiers
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZagreb
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAthens
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBucharest
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCairo
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashHarare
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashHelsinki
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJerusalem
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKiev
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRiga
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSofia
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashTallinn
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVilnius
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaghdad
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashIstanbul
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuwait
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMinsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMoscow
    - typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashNairobi
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRiyadh
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVolgograd
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTehran
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMuscat
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaku
    - typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSamara
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTbilisi
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYerevan
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKabul
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKarachi
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTashkent
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKolkata
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashColombo
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKathmandu
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashAlmaty
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashDhaka
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUrumqi
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRangoon
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBangkok
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJakarta
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashShanghai
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashChongqing
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashPerth
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSingapore
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTaipei
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTokyo
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSeoul
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYakutsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashDarwin
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuam
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashHobart
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby
    - typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashSydney
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashVladivostok
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMagadan
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashNoumea
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashAuckland
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFiji
    - typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKamchatka
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMajuro
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashChatham
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashTongatapu
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashApia
    - typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFakaofo
  */
  trait Timezone extends StObject
  object Timezone {
    
    inline def AfricaSlashAlgiers: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashAlgiers = "Africa/Algiers".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashAlgiers]
    
    inline def AfricaSlashCairo: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCairo = "Africa/Cairo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCairo]
    
    inline def AfricaSlashCasablanca: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCasablanca = "Africa/Casablanca".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashCasablanca]
    
    inline def AfricaSlashHarare: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashHarare = "Africa/Harare".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashHarare]
    
    inline def AfricaSlashJohannesburg: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg = "Africa/Johannesburg".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg]
    
    inline def AfricaSlashMonrovia: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashMonrovia = "Africa/Monrovia".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashMonrovia]
    
    inline def AfricaSlashNairobi: typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashNairobi = "Africa/Nairobi".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AfricaSlashNairobi]
    
    inline def AmericaSlashArgentinaSlashBuenos_Aires: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires = "America/Argentina/Buenos_Aires".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires]
    
    inline def AmericaSlashBogota: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashBogota = "America/Bogota".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashBogota]
    
    inline def AmericaSlashCaracas: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashCaracas = "America/Caracas".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashCaracas]
    
    inline def AmericaSlashChicago: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChicago = "America/Chicago".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChicago]
    
    inline def AmericaSlashChihuahua: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChihuahua = "America/Chihuahua".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashChihuahua]
    
    inline def AmericaSlashDenver: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashDenver = "America/Denver".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashDenver]
    
    inline def AmericaSlashGodthab: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGodthab = "America/Godthab".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGodthab]
    
    inline def AmericaSlashGuatemala: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuatemala = "America/Guatemala".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuatemala]
    
    inline def AmericaSlashGuyana: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuyana = "America/Guyana".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashGuyana]
    
    inline def AmericaSlashHalifax: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashHalifax = "America/Halifax".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashHalifax]
    
    inline def AmericaSlashIndianaSlashIndianapolis: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis = "America/Indiana/Indianapolis".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis]
    
    inline def AmericaSlashJuneau: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashJuneau = "America/Juneau".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashJuneau]
    
    inline def AmericaSlashLa_Paz: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz = "America/La_Paz".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz]
    
    inline def AmericaSlashLima: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLima = "America/Lima".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLima]
    
    inline def AmericaSlashLos_Angeles: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles = "America/Los_Angeles".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles]
    
    inline def AmericaSlashMazatlan: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMazatlan = "America/Mazatlan".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMazatlan]
    
    inline def AmericaSlashMexico_City: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMexico_City = "America/Mexico_City".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMexico_City]
    
    inline def AmericaSlashMonterrey: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMonterrey = "America/Monterrey".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMonterrey]
    
    inline def AmericaSlashMontevideo: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMontevideo = "America/Montevideo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashMontevideo]
    
    inline def AmericaSlashNew_York: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashNew_York = "America/New_York".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashNew_York]
    
    inline def AmericaSlashPhoenix: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPhoenix = "America/Phoenix".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPhoenix]
    
    inline def AmericaSlashPuerto_Rico: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico = "America/Puerto_Rico".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico]
    
    inline def AmericaSlashRegina: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashRegina = "America/Regina".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashRegina]
    
    inline def AmericaSlashSantiago: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSantiago = "America/Santiago".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSantiago]
    
    inline def AmericaSlashSao_Paulo: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo = "America/Sao_Paulo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo]
    
    inline def AmericaSlashSt_Johns: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns = "America/St_Johns".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns]
    
    inline def AmericaSlashTijuana: typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashTijuana = "America/Tijuana".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AmericaSlashTijuana]
    
    inline def AsiaSlashAlmaty: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashAlmaty = "Asia/Almaty".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashAlmaty]
    
    inline def AsiaSlashBaghdad: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaghdad = "Asia/Baghdad".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaghdad]
    
    inline def AsiaSlashBaku: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaku = "Asia/Baku".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBaku]
    
    inline def AsiaSlashBangkok: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBangkok = "Asia/Bangkok".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashBangkok]
    
    inline def AsiaSlashChongqing: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashChongqing = "Asia/Chongqing".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashChongqing]
    
    inline def AsiaSlashColombo: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashColombo = "Asia/Colombo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashColombo]
    
    inline def AsiaSlashDhaka: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashDhaka = "Asia/Dhaka".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashDhaka]
    
    inline def AsiaSlashHong_Kong: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong = "Asia/Hong_Kong".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong]
    
    inline def AsiaSlashIrkutsk: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk = "Asia/Irkutsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk]
    
    inline def AsiaSlashJakarta: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJakarta = "Asia/Jakarta".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJakarta]
    
    inline def AsiaSlashJerusalem: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJerusalem = "Asia/Jerusalem".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashJerusalem]
    
    inline def AsiaSlashKabul: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKabul = "Asia/Kabul".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKabul]
    
    inline def AsiaSlashKamchatka: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKamchatka = "Asia/Kamchatka".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKamchatka]
    
    inline def AsiaSlashKarachi: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKarachi = "Asia/Karachi".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKarachi]
    
    inline def AsiaSlashKathmandu: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKathmandu = "Asia/Kathmandu".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKathmandu]
    
    inline def AsiaSlashKolkata: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKolkata = "Asia/Kolkata".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKolkata]
    
    inline def AsiaSlashKrasnoyarsk: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk = "Asia/Krasnoyarsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk]
    
    inline def AsiaSlashKuala_Lumpur: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur = "Asia/Kuala_Lumpur".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur]
    
    inline def AsiaSlashKuwait: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuwait = "Asia/Kuwait".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashKuwait]
    
    inline def AsiaSlashMagadan: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMagadan = "Asia/Magadan".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMagadan]
    
    inline def AsiaSlashMuscat: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMuscat = "Asia/Muscat".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashMuscat]
    
    inline def AsiaSlashNovosibirsk: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk = "Asia/Novosibirsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk]
    
    inline def AsiaSlashRangoon: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRangoon = "Asia/Rangoon".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRangoon]
    
    inline def AsiaSlashRiyadh: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRiyadh = "Asia/Riyadh".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashRiyadh]
    
    inline def AsiaSlashSeoul: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSeoul = "Asia/Seoul".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSeoul]
    
    inline def AsiaSlashShanghai: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashShanghai = "Asia/Shanghai".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashShanghai]
    
    inline def AsiaSlashSingapore: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSingapore = "Asia/Singapore".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSingapore]
    
    inline def AsiaSlashSrednekolymsk: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk = "Asia/Srednekolymsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk]
    
    inline def AsiaSlashTaipei: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTaipei = "Asia/Taipei".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTaipei]
    
    inline def AsiaSlashTashkent: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTashkent = "Asia/Tashkent".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTashkent]
    
    inline def AsiaSlashTbilisi: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTbilisi = "Asia/Tbilisi".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTbilisi]
    
    inline def AsiaSlashTehran: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTehran = "Asia/Tehran".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTehran]
    
    inline def AsiaSlashTokyo: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTokyo = "Asia/Tokyo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashTokyo]
    
    inline def AsiaSlashUlaanbaatar: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar = "Asia/Ulaanbaatar".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar]
    
    inline def AsiaSlashUrumqi: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUrumqi = "Asia/Urumqi".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashUrumqi]
    
    inline def AsiaSlashVladivostok: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashVladivostok = "Asia/Vladivostok".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashVladivostok]
    
    inline def AsiaSlashYakutsk: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYakutsk = "Asia/Yakutsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYakutsk]
    
    inline def AsiaSlashYekaterinburg: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg = "Asia/Yekaterinburg".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg]
    
    inline def AsiaSlashYerevan: typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYerevan = "Asia/Yerevan".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AsiaSlashYerevan]
    
    inline def AtlanticSlashAzores: typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashAzores = "Atlantic/Azores".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashAzores]
    
    inline def AtlanticSlashCape_Verde: typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde = "Atlantic/Cape_Verde".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde]
    
    inline def AtlanticSlashSouth_Georgia: typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia = "Atlantic/South_Georgia".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia]
    
    inline def AustraliaSlashAdelaide: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide = "Australia/Adelaide".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide]
    
    inline def AustraliaSlashBrisbane: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane = "Australia/Brisbane".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane]
    
    inline def AustraliaSlashDarwin: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashDarwin = "Australia/Darwin".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashDarwin]
    
    inline def AustraliaSlashHobart: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashHobart = "Australia/Hobart".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashHobart]
    
    inline def AustraliaSlashMelbourne: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne = "Australia/Melbourne".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne]
    
    inline def AustraliaSlashPerth: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashPerth = "Australia/Perth".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashPerth]
    
    inline def AustraliaSlashSydney: typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashSydney = "Australia/Sydney".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.AustraliaSlashSydney]
    
    inline def EtcSlashGMTPlussign12: typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12 = "Etc/GMT+12".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12]
    
    inline def EtcSlashUTC: typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashUTC = "Etc/UTC".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EtcSlashUTC]
    
    inline def EuropeSlashAmsterdam: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam = "Europe/Amsterdam".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam]
    
    inline def EuropeSlashAthens: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAthens = "Europe/Athens".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashAthens]
    
    inline def EuropeSlashBelgrade: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBelgrade = "Europe/Belgrade".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBelgrade]
    
    inline def EuropeSlashBerlin: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBerlin = "Europe/Berlin".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBerlin]
    
    inline def EuropeSlashBratislava: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBratislava = "Europe/Bratislava".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBratislava]
    
    inline def EuropeSlashBrussels: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBrussels = "Europe/Brussels".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBrussels]
    
    inline def EuropeSlashBucharest: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBucharest = "Europe/Bucharest".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBucharest]
    
    inline def EuropeSlashBudapest: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBudapest = "Europe/Budapest".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashBudapest]
    
    inline def EuropeSlashCopenhagen: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen = "Europe/Copenhagen".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen]
    
    inline def EuropeSlashDublin: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashDublin = "Europe/Dublin".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashDublin]
    
    inline def EuropeSlashHelsinki: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashHelsinki = "Europe/Helsinki".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashHelsinki]
    
    inline def EuropeSlashIstanbul: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashIstanbul = "Europe/Istanbul".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashIstanbul]
    
    inline def EuropeSlashKaliningrad: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad = "Europe/Kaliningrad".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad]
    
    inline def EuropeSlashKiev: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKiev = "Europe/Kiev".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashKiev]
    
    inline def EuropeSlashLisbon: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLisbon = "Europe/Lisbon".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLisbon]
    
    inline def EuropeSlashLjubljana: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLjubljana = "Europe/Ljubljana".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLjubljana]
    
    inline def EuropeSlashLondon: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLondon = "Europe/London".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashLondon]
    
    inline def EuropeSlashMadrid: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMadrid = "Europe/Madrid".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMadrid]
    
    inline def EuropeSlashMinsk: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMinsk = "Europe/Minsk".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMinsk]
    
    inline def EuropeSlashMoscow: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMoscow = "Europe/Moscow".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashMoscow]
    
    inline def EuropeSlashParis: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashParis = "Europe/Paris".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashParis]
    
    inline def EuropeSlashPrague: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashPrague = "Europe/Prague".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashPrague]
    
    inline def EuropeSlashRiga: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRiga = "Europe/Riga".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRiga]
    
    inline def EuropeSlashRome: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRome = "Europe/Rome".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashRome]
    
    inline def EuropeSlashSamara: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSamara = "Europe/Samara".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSamara]
    
    inline def EuropeSlashSarajevo: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSarajevo = "Europe/Sarajevo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSarajevo]
    
    inline def EuropeSlashSkopje: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSkopje = "Europe/Skopje".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSkopje]
    
    inline def EuropeSlashSofia: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSofia = "Europe/Sofia".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashSofia]
    
    inline def EuropeSlashStockholm: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashStockholm = "Europe/Stockholm".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashStockholm]
    
    inline def EuropeSlashTallinn: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashTallinn = "Europe/Tallinn".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashTallinn]
    
    inline def EuropeSlashVienna: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVienna = "Europe/Vienna".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVienna]
    
    inline def EuropeSlashVilnius: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVilnius = "Europe/Vilnius".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVilnius]
    
    inline def EuropeSlashVolgograd: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVolgograd = "Europe/Volgograd".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashVolgograd]
    
    inline def EuropeSlashWarsaw: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashWarsaw = "Europe/Warsaw".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashWarsaw]
    
    inline def EuropeSlashZagreb: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZagreb = "Europe/Zagreb".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZagreb]
    
    inline def EuropeSlashZurich: typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZurich = "Europe/Zurich".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.EuropeSlashZurich]
    
    inline def PacificSlashApia: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashApia = "Pacific/Apia".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashApia]
    
    inline def PacificSlashAuckland: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashAuckland = "Pacific/Auckland".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashAuckland]
    
    inline def PacificSlashChatham: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashChatham = "Pacific/Chatham".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashChatham]
    
    inline def PacificSlashFakaofo: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFakaofo = "Pacific/Fakaofo".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFakaofo]
    
    inline def PacificSlashFiji: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFiji = "Pacific/Fiji".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashFiji]
    
    inline def PacificSlashGuadalcanal: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal = "Pacific/Guadalcanal".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal]
    
    inline def PacificSlashGuam: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuam = "Pacific/Guam".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashGuam]
    
    inline def PacificSlashHonolulu: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashHonolulu = "Pacific/Honolulu".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashHonolulu]
    
    inline def PacificSlashMajuro: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMajuro = "Pacific/Majuro".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMajuro]
    
    inline def PacificSlashMidway: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMidway = "Pacific/Midway".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashMidway]
    
    inline def PacificSlashNoumea: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashNoumea = "Pacific/Noumea".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashNoumea]
    
    inline def PacificSlashPago_Pago: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPago_Pago = "Pacific/Pago_Pago".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPago_Pago]
    
    inline def PacificSlashPort_Moresby: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby = "Pacific/Port_Moresby".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby]
    
    inline def PacificSlashTongatapu: typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashTongatapu = "Pacific/Tongatapu".asInstanceOf[typingsJapgolly.tzOffset.tzOffsetStrings.PacificSlashTongatapu]
  }
}
