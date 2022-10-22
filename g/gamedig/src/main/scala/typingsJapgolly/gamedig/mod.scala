package typingsJapgolly.gamedig

import typingsJapgolly.gamedig.anon.ListenUdpPort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gamedig", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Gamedig {
    def this(runnerOpts: ListenUdpPort) = this()
  }
  @JSImport("gamedig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getInstance(): Gamedig = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Gamedig]
  
  /* static member */
  inline def query(options: QueryOptions): js.Promise[QueryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QueryResult]]
  /* static member */
  inline def query(options: QueryOptions, callback: js.Function2[/* error */ js.Error, /* state */ QueryResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Gamedig extends StObject {
    
    def query(options: QueryOptions): js.Promise[QueryResult] = js.native
    def query(options: QueryOptions, callback: js.Function2[/* error */ js.Error, /* state */ QueryResult, Unit]): Unit = js.native
  }
  
  trait Player extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ping: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[js.Object] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
    
    var team: js.UndefOr[String] = js.undefined
  }
  object Player {
    
    inline def apply(): Player = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Player]
    }
    
    extension [Self <: Player](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
      
      inline def setRaw(value: js.Object): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  trait QueryOptions extends StObject {
    
    var attemptTimeout: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var givenPortOnly: js.UndefOr[Boolean] = js.undefined
    
    var host: String
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var requestRules: js.UndefOr[Boolean] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var `type`: Type
  }
  object QueryOptions {
    
    inline def apply(host: String, `type`: Type): QueryOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setAttemptTimeout(value: Double): Self = StObject.set(x, "attemptTimeout", value.asInstanceOf[js.Any])
      
      inline def setAttemptTimeoutUndefined: Self = StObject.set(x, "attemptTimeout", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGivenPortOnly(value: Boolean): Self = StObject.set(x, "givenPortOnly", value.asInstanceOf[js.Any])
      
      inline def setGivenPortOnlyUndefined: Self = StObject.set(x, "givenPortOnly", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRequestRules(value: Boolean): Self = StObject.set(x, "requestRules", value.asInstanceOf[js.Any])
      
      inline def setRequestRulesUndefined: Self = StObject.set(x, "requestRules", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryResult extends StObject {
    
    var bots: js.Array[Player]
    
    var connect: String
    
    var map: String
    
    var maxplayers: Double
    
    var name: String
    
    var password: Boolean
    
    var ping: Double
    
    var players: js.Array[Player]
    
    var raw: js.UndefOr[js.Object] = js.undefined
  }
  object QueryResult {
    
    inline def apply(
      bots: js.Array[Player],
      connect: String,
      map: String,
      maxplayers: Double,
      name: String,
      password: Boolean,
      ping: Double,
      players: js.Array[Player]
    ): QueryResult = {
      val __obj = js.Dynamic.literal(bots = bots.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], maxplayers = maxplayers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult]
    }
    
    extension [Self <: QueryResult](x: Self) {
      
      inline def setBots(value: js.Array[Player]): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
      
      inline def setBotsVarargs(value: Player*): Self = StObject.set(x, "bots", js.Array(value*))
      
      inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMaxplayers(value: Double): Self = StObject.set(x, "maxplayers", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPlayers(value: js.Array[Player]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersVarargs(value: Player*): Self = StObject.set(x, "players", js.Array(value*))
      
      inline def setRaw(value: js.Object): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gamedig.gamedigStrings.`7d2d`
    - typingsJapgolly.gamedig.gamedigStrings.ageofchivalry
    - typingsJapgolly.gamedig.gamedigStrings.aoe2
    - typingsJapgolly.gamedig.gamedigStrings.alienarena
    - typingsJapgolly.gamedig.gamedigStrings.alienswarm
    - typingsJapgolly.gamedig.gamedigStrings.arkse
    - typingsJapgolly.gamedig.gamedigStrings.assettocorsa
    - typingsJapgolly.gamedig.gamedigStrings.atlas
    - typingsJapgolly.gamedig.gamedigStrings.avp2
    - typingsJapgolly.gamedig.gamedigStrings.avp2010
    - typingsJapgolly.gamedig.gamedigStrings.americasarmy
    - typingsJapgolly.gamedig.gamedigStrings.americasarmy2
    - typingsJapgolly.gamedig.gamedigStrings.americasarmy3
    - typingsJapgolly.gamedig.gamedigStrings.americasarmypg
    - typingsJapgolly.gamedig.gamedigStrings.arcasimracing
    - typingsJapgolly.gamedig.gamedigStrings.arma
    - typingsJapgolly.gamedig.gamedigStrings.arma2
    - typingsJapgolly.gamedig.gamedigStrings.arma2oa
    - typingsJapgolly.gamedig.gamedigStrings.armacwa
    - typingsJapgolly.gamedig.gamedigStrings.armar
    - typingsJapgolly.gamedig.gamedigStrings.arma3
    - typingsJapgolly.gamedig.gamedigStrings.armagetron
    - typingsJapgolly.gamedig.gamedigStrings.baldursgate
    - typingsJapgolly.gamedig.gamedigStrings.barotrauma
    - typingsJapgolly.gamedig.gamedigStrings.bat1944
    - typingsJapgolly.gamedig.gamedigStrings.bf1942
    - typingsJapgolly.gamedig.gamedigStrings.bfv
    - typingsJapgolly.gamedig.gamedigStrings.bf2
    - typingsJapgolly.gamedig.gamedigStrings.bf2142
    - typingsJapgolly.gamedig.gamedigStrings.bfbc2
    - typingsJapgolly.gamedig.gamedigStrings.bf3
    - typingsJapgolly.gamedig.gamedigStrings.bf4
    - typingsJapgolly.gamedig.gamedigStrings.bfh
    - typingsJapgolly.gamedig.gamedigStrings.breach
    - typingsJapgolly.gamedig.gamedigStrings.breed
    - typingsJapgolly.gamedig.gamedigStrings.brink
    - typingsJapgolly.gamedig.gamedigStrings.buildandshoot
    - typingsJapgolly.gamedig.gamedigStrings.cod
    - typingsJapgolly.gamedig.gamedigStrings.coduo
    - typingsJapgolly.gamedig.gamedigStrings.cod2
    - typingsJapgolly.gamedig.gamedigStrings.cod3
    - typingsJapgolly.gamedig.gamedigStrings.cod4
    - typingsJapgolly.gamedig.gamedigStrings.codwaw
    - typingsJapgolly.gamedig.gamedigStrings.codmw2
    - typingsJapgolly.gamedig.gamedigStrings.codmw3
    - typingsJapgolly.gamedig.gamedigStrings.callofjuarez
    - typingsJapgolly.gamedig.gamedigStrings.chaser
    - typingsJapgolly.gamedig.gamedigStrings.chrome
    - typingsJapgolly.gamedig.gamedigStrings.codenameeagle
    - typingsJapgolly.gamedig.gamedigStrings.commandos3
    - typingsJapgolly.gamedig.gamedigStrings.cacrenegade
    - typingsJapgolly.gamedig.gamedigStrings.conanexiles
    - typingsJapgolly.gamedig.gamedigStrings.contagion
    - typingsJapgolly.gamedig.gamedigStrings.contactjack
    - typingsJapgolly.gamedig.gamedigStrings.cs15
    - typingsJapgolly.gamedig.gamedigStrings.cs16
    - typingsJapgolly.gamedig.gamedigStrings.cs2d
    - typingsJapgolly.gamedig.gamedigStrings.cscz
    - typingsJapgolly.gamedig.gamedigStrings.css
    - typingsJapgolly.gamedig.gamedigStrings.csgo
    - typingsJapgolly.gamedig.gamedigStrings.crossracing
    - typingsJapgolly.gamedig.gamedigStrings.crysis
    - typingsJapgolly.gamedig.gamedigStrings.crysiswars
    - typingsJapgolly.gamedig.gamedigStrings.crysis2
    - typingsJapgolly.gamedig.gamedigStrings.daikatana
    - typingsJapgolly.gamedig.gamedigStrings.dmomam
    - typingsJapgolly.gamedig.gamedigStrings.darkesthour
    - typingsJapgolly.gamedig.gamedigStrings.daysofwar
    - typingsJapgolly.gamedig.gamedigStrings.dayz
    - typingsJapgolly.gamedig.gamedigStrings.dayzmod
    - typingsJapgolly.gamedig.gamedigStrings.deadlydozenpt
    - typingsJapgolly.gamedig.gamedigStrings.dh2005
    - typingsJapgolly.gamedig.gamedigStrings.descent3
    - typingsJapgolly.gamedig.gamedigStrings.deusex
    - typingsJapgolly.gamedig.gamedigStrings.devastation
    - typingsJapgolly.gamedig.gamedigStrings.dinodday
    - typingsJapgolly.gamedig.gamedigStrings.dirttrackracing2
    - typingsJapgolly.gamedig.gamedigStrings.discord
    - typingsJapgolly.gamedig.gamedigStrings.dnl
    - typingsJapgolly.gamedig.gamedigStrings.dod
    - typingsJapgolly.gamedig.gamedigStrings.dods
    - typingsJapgolly.gamedig.gamedigStrings.doi
    - typingsJapgolly.gamedig.gamedigStrings.doom3
    - typingsJapgolly.gamedig.gamedigStrings.dota2
    - typingsJapgolly.gamedig.gamedigStrings.drakan
    - typingsJapgolly.gamedig.gamedigStrings.empyrion
    - typingsJapgolly.gamedig.gamedigStrings.etqw
    - typingsJapgolly.gamedig.gamedigStrings.fear
    - typingsJapgolly.gamedig.gamedigStrings.f12002
    - typingsJapgolly.gamedig.gamedigStrings.f1c9902
    - typingsJapgolly.gamedig.gamedigStrings.farcry
    - typingsJapgolly.gamedig.gamedigStrings.farcry2
    - typingsJapgolly.gamedig.gamedigStrings.fortressforever
    - typingsJapgolly.gamedig.gamedigStrings.operationflashpoint
    - typingsJapgolly.gamedig.gamedigStrings.flashpoint
    - typingsJapgolly.gamedig.gamedigStrings.flashpointresistance
    - typingsJapgolly.gamedig.gamedigStrings.ffow
    - typingsJapgolly.gamedig.gamedigStrings.fivem
    - typingsJapgolly.gamedig.gamedigStrings.forrest
    - typingsJapgolly.gamedig.gamedigStrings.garrysmod
    - typingsJapgolly.gamedig.gamedigStrings.graw
    - typingsJapgolly.gamedig.gamedigStrings.graw2
    - typingsJapgolly.gamedig.gamedigStrings.giantscitizenkabuto
    - typingsJapgolly.gamedig.gamedigStrings.globaloperations
    - typingsJapgolly.gamedig.gamedigStrings.geneshift
    - typingsJapgolly.gamedig.gamedigStrings.mutantfactions
    - typingsJapgolly.gamedig.gamedigStrings.ges
    - typingsJapgolly.gamedig.gamedigStrings.gore
    - typingsJapgolly.gamedig.gamedigStrings.groundbreach
    - typingsJapgolly.gamedig.gamedigStrings.gunmanchronicles
    - typingsJapgolly.gamedig.gamedigStrings.hldm
    - typingsJapgolly.gamedig.gamedigStrings.hldms
    - typingsJapgolly.gamedig.gamedigStrings.hl2dm
    - typingsJapgolly.gamedig.gamedigStrings.halo
    - typingsJapgolly.gamedig.gamedigStrings.halo2
    - typingsJapgolly.gamedig.gamedigStrings.heretic2
    - typingsJapgolly.gamedig.gamedigStrings.hexen2
    - typingsJapgolly.gamedig.gamedigStrings.hidden
    - typingsJapgolly.gamedig.gamedigStrings.hll
    - typingsJapgolly.gamedig.gamedigStrings.had2
    - typingsJapgolly.gamedig.gamedigStrings.homefront
    - typingsJapgolly.gamedig.gamedigStrings.homeworld2
    - typingsJapgolly.gamedig.gamedigStrings.hurtworld
    - typingsJapgolly.gamedig.gamedigStrings.igi2
    - typingsJapgolly.gamedig.gamedigStrings.il2
    - typingsJapgolly.gamedig.gamedigStrings.insurgency
    - typingsJapgolly.gamedig.gamedigStrings.insurgencysandstorm
    - typingsJapgolly.gamedig.gamedigStrings.ironstorm
    - typingsJapgolly.gamedig.gamedigStrings.jamesbondnightfire
    - typingsJapgolly.gamedig.gamedigStrings.jc2mp
    - typingsJapgolly.gamedig.gamedigStrings.jc3mp
    - typingsJapgolly.gamedig.gamedigStrings.killingfloor
    - typingsJapgolly.gamedig.gamedigStrings.killingfloor2
    - typingsJapgolly.gamedig.gamedigStrings.kingpin
    - typingsJapgolly.gamedig.gamedigStrings.kisspc
    - typingsJapgolly.gamedig.gamedigStrings.kspdmp
    - typingsJapgolly.gamedig.gamedigStrings.kzmod
    - typingsJapgolly.gamedig.gamedigStrings.left4dead
    - typingsJapgolly.gamedig.gamedigStrings.left4dead2
    - typingsJapgolly.gamedig.gamedigStrings.m2mp
    - typingsJapgolly.gamedig.gamedigStrings.m2o
    - typingsJapgolly.gamedig.gamedigStrings.medievalengineers
    - typingsJapgolly.gamedig.gamedigStrings.mohaa
    - typingsJapgolly.gamedig.gamedigStrings.mohsh
    - typingsJapgolly.gamedig.gamedigStrings.mohbt
    - typingsJapgolly.gamedig.gamedigStrings.mohpa
    - typingsJapgolly.gamedig.gamedigStrings.mohab
    - typingsJapgolly.gamedig.gamedigStrings.moh2010
    - typingsJapgolly.gamedig.gamedigStrings.mohwf
    - typingsJapgolly.gamedig.gamedigStrings.minecraft
    - typingsJapgolly.gamedig.gamedigStrings.minecraftping
    - typingsJapgolly.gamedig.gamedigStrings.minecraftpe
    - typingsJapgolly.gamedig.gamedigStrings.minecraftbe
    - typingsJapgolly.gamedig.gamedigStrings.mnc
    - typingsJapgolly.gamedig.gamedigStrings.mordhau
    - typingsJapgolly.gamedig.gamedigStrings.mtavc
    - typingsJapgolly.gamedig.gamedigStrings.mtasa
    - typingsJapgolly.gamedig.gamedigStrings.mumble
    - typingsJapgolly.gamedig.gamedigStrings.mumbleping
    - typingsJapgolly.gamedig.gamedigStrings.nascarthunder2004
    - typingsJapgolly.gamedig.gamedigStrings.netpanzer
    - typingsJapgolly.gamedig.gamedigStrings.nmrih
    - typingsJapgolly.gamedig.gamedigStrings.ns
    - typingsJapgolly.gamedig.gamedigStrings.ns2
    - typingsJapgolly.gamedig.gamedigStrings.nfshp2
    - typingsJapgolly.gamedig.gamedigStrings.nab
    - typingsJapgolly.gamedig.gamedigStrings.nwn
    - typingsJapgolly.gamedig.gamedigStrings.nwn2
    - typingsJapgolly.gamedig.gamedigStrings.nexuiz
    - typingsJapgolly.gamedig.gamedigStrings.nitrofamily
    - typingsJapgolly.gamedig.gamedigStrings.nolf
    - typingsJapgolly.gamedig.gamedigStrings.nolf2
    - typingsJapgolly.gamedig.gamedigStrings.nucleardawn
    - typingsJapgolly.gamedig.gamedigStrings.openarena
    - typingsJapgolly.gamedig.gamedigStrings.openttd
    - typingsJapgolly.gamedig.gamedigStrings.painkiller
    - typingsJapgolly.gamedig.gamedigStrings.pixark
    - typingsJapgolly.gamedig.gamedigStrings.ps
    - typingsJapgolly.gamedig.gamedigStrings.postal2
    - typingsJapgolly.gamedig.gamedigStrings.prey
    - typingsJapgolly.gamedig.gamedigStrings.primalcarnage
    - typingsJapgolly.gamedig.gamedigStrings.prbf2
    - typingsJapgolly.gamedig.gamedigStrings.przomboid
    - typingsJapgolly.gamedig.gamedigStrings.quake1
    - typingsJapgolly.gamedig.gamedigStrings.quake2
    - typingsJapgolly.gamedig.gamedigStrings.quake3
    - typingsJapgolly.gamedig.gamedigStrings.quake4
    - typingsJapgolly.gamedig.gamedigStrings.quakelive
    - typingsJapgolly.gamedig.gamedigStrings.ragdollkungfu
    - typingsJapgolly.gamedig.gamedigStrings.r6
    - typingsJapgolly.gamedig.gamedigStrings.r6roguespear
    - typingsJapgolly.gamedig.gamedigStrings.r6ravenshield
    - typingsJapgolly.gamedig.gamedigStrings.rallisportchallenge
    - typingsJapgolly.gamedig.gamedigStrings.rallymasters
    - typingsJapgolly.gamedig.gamedigStrings.redorchestra
    - typingsJapgolly.gamedig.gamedigStrings.redorchestraost
    - typingsJapgolly.gamedig.gamedigStrings.redorchestra2
    - typingsJapgolly.gamedig.gamedigStrings.redline
    - typingsJapgolly.gamedig.gamedigStrings.rtcw
    - typingsJapgolly.gamedig.gamedigStrings.rfactor
    - typingsJapgolly.gamedig.gamedigStrings.ricochet
    - typingsJapgolly.gamedig.gamedigStrings.riseofnations
    - typingsJapgolly.gamedig.gamedigStrings.rs2
    - typingsJapgolly.gamedig.gamedigStrings.rune
    - typingsJapgolly.gamedig.gamedigStrings.rust
    - typingsJapgolly.gamedig.gamedigStrings.samp
    - typingsJapgolly.gamedig.gamedigStrings.savage2
    - typingsJapgolly.gamedig.gamedigStrings.spaceengineers
    - typingsJapgolly.gamedig.gamedigStrings.ss
    - typingsJapgolly.gamedig.gamedigStrings.ss2
    - typingsJapgolly.gamedig.gamedigStrings.shatteredhorizon
    - typingsJapgolly.gamedig.gamedigStrings.ship
    - typingsJapgolly.gamedig.gamedigStrings.shogo
    - typingsJapgolly.gamedig.gamedigStrings.shootmania
    - typingsJapgolly.gamedig.gamedigStrings.sin
    - typingsJapgolly.gamedig.gamedigStrings.sinep
    - typingsJapgolly.gamedig.gamedigStrings.soldat
    - typingsJapgolly.gamedig.gamedigStrings.sof
    - typingsJapgolly.gamedig.gamedigStrings.sof2
    - typingsJapgolly.gamedig.gamedigStrings.stalker
    - typingsJapgolly.gamedig.gamedigStrings.stbc
    - typingsJapgolly.gamedig.gamedigStrings.stvef
    - typingsJapgolly.gamedig.gamedigStrings.stvef2
    - typingsJapgolly.gamedig.gamedigStrings.squad
    - typingsJapgolly.gamedig.gamedigStrings.swbf
    - typingsJapgolly.gamedig.gamedigStrings.swbf2
    - typingsJapgolly.gamedig.gamedigStrings.swjk
    - typingsJapgolly.gamedig.gamedigStrings.swjk2
    - typingsJapgolly.gamedig.gamedigStrings.swrc
    - typingsJapgolly.gamedig.gamedigStrings.starbound
    - typingsJapgolly.gamedig.gamedigStrings.starmade
    - typingsJapgolly.gamedig.gamedigStrings.starsiege
    - typingsJapgolly.gamedig.gamedigStrings.suicidesurvival
    - typingsJapgolly.gamedig.gamedigStrings.swat4
    - typingsJapgolly.gamedig.gamedigStrings.svencoop
    - typingsJapgolly.gamedig.gamedigStrings.synergy
    - typingsJapgolly.gamedig.gamedigStrings.tacticalops
    - typingsJapgolly.gamedig.gamedigStrings.takeonhelicopters
    - typingsJapgolly.gamedig.gamedigStrings.teamfactor
    - typingsJapgolly.gamedig.gamedigStrings.tfc
    - typingsJapgolly.gamedig.gamedigStrings.tf2
    - typingsJapgolly.gamedig.gamedigStrings.teamspeak2
    - typingsJapgolly.gamedig.gamedigStrings.teamspeak3
    - typingsJapgolly.gamedig.gamedigStrings.terminus
    - typingsJapgolly.gamedig.gamedigStrings.terraria
    - typingsJapgolly.gamedig.gamedigStrings.tshock
    - typingsJapgolly.gamedig.gamedigStrings.thps3
    - typingsJapgolly.gamedig.gamedigStrings.thps4
    - typingsJapgolly.gamedig.gamedigStrings.thu2
    - typingsJapgolly.gamedig.gamedigStrings.towerunite
    - typingsJapgolly.gamedig.gamedigStrings.trackmania2
    - typingsJapgolly.gamedig.gamedigStrings.trackmaniaforever
    - typingsJapgolly.gamedig.gamedigStrings.tremulous
    - typingsJapgolly.gamedig.gamedigStrings.tribes1
    - typingsJapgolly.gamedig.gamedigStrings.tribesvengeance
    - typingsJapgolly.gamedig.gamedigStrings.tron20
    - typingsJapgolly.gamedig.gamedigStrings.turok2
    - typingsJapgolly.gamedig.gamedigStrings.universalcombat
    - typingsJapgolly.gamedig.gamedigStrings.unreal
    - typingsJapgolly.gamedig.gamedigStrings.unturned
    - typingsJapgolly.gamedig.gamedigStrings.ut
    - typingsJapgolly.gamedig.gamedigStrings.ut2003
    - typingsJapgolly.gamedig.gamedigStrings.ut2004
    - typingsJapgolly.gamedig.gamedigStrings.ut3
    - typingsJapgolly.gamedig.gamedigStrings.urbanterror
    - typingsJapgolly.gamedig.gamedigStrings.v8supercar
    - typingsJapgolly.gamedig.gamedigStrings.valheim
    - typingsJapgolly.gamedig.gamedigStrings.vcmp
    - typingsJapgolly.gamedig.gamedigStrings.ventrilo
    - typingsJapgolly.gamedig.gamedigStrings.vietcong
    - typingsJapgolly.gamedig.gamedigStrings.vietcong2
    - typingsJapgolly.gamedig.gamedigStrings.warsow
    - typingsJapgolly.gamedig.gamedigStrings.wheeloftime
    - typingsJapgolly.gamedig.gamedigStrings.wolfenstein2009
    - typingsJapgolly.gamedig.gamedigStrings.wolfensteinet
    - typingsJapgolly.gamedig.gamedigStrings.xpandrally
    - typingsJapgolly.gamedig.gamedigStrings.zombiemaster
    - typingsJapgolly.gamedig.gamedigStrings.zps
  */
  trait Type extends StObject
  object Type {
    
    inline def `7d2d`: typingsJapgolly.gamedig.gamedigStrings.`7d2d` = "7d2d".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.`7d2d`]
    
    inline def ageofchivalry: typingsJapgolly.gamedig.gamedigStrings.ageofchivalry = "ageofchivalry".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ageofchivalry]
    
    inline def alienarena: typingsJapgolly.gamedig.gamedigStrings.alienarena = "alienarena".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.alienarena]
    
    inline def alienswarm: typingsJapgolly.gamedig.gamedigStrings.alienswarm = "alienswarm".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.alienswarm]
    
    inline def americasarmy: typingsJapgolly.gamedig.gamedigStrings.americasarmy = "americasarmy".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.americasarmy]
    
    inline def americasarmy2: typingsJapgolly.gamedig.gamedigStrings.americasarmy2 = "americasarmy2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.americasarmy2]
    
    inline def americasarmy3: typingsJapgolly.gamedig.gamedigStrings.americasarmy3 = "americasarmy3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.americasarmy3]
    
    inline def americasarmypg: typingsJapgolly.gamedig.gamedigStrings.americasarmypg = "americasarmypg".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.americasarmypg]
    
    inline def aoe2: typingsJapgolly.gamedig.gamedigStrings.aoe2 = "aoe2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.aoe2]
    
    inline def arcasimracing: typingsJapgolly.gamedig.gamedigStrings.arcasimracing = "arcasimracing".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arcasimracing]
    
    inline def arkse: typingsJapgolly.gamedig.gamedigStrings.arkse = "arkse".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arkse]
    
    inline def arma: typingsJapgolly.gamedig.gamedigStrings.arma = "arma".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arma]
    
    inline def arma2: typingsJapgolly.gamedig.gamedigStrings.arma2 = "arma2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arma2]
    
    inline def arma2oa: typingsJapgolly.gamedig.gamedigStrings.arma2oa = "arma2oa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arma2oa]
    
    inline def arma3: typingsJapgolly.gamedig.gamedigStrings.arma3 = "arma3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.arma3]
    
    inline def armacwa: typingsJapgolly.gamedig.gamedigStrings.armacwa = "armacwa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.armacwa]
    
    inline def armagetron: typingsJapgolly.gamedig.gamedigStrings.armagetron = "armagetron".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.armagetron]
    
    inline def armar: typingsJapgolly.gamedig.gamedigStrings.armar = "armar".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.armar]
    
    inline def assettocorsa: typingsJapgolly.gamedig.gamedigStrings.assettocorsa = "assettocorsa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.assettocorsa]
    
    inline def atlas: typingsJapgolly.gamedig.gamedigStrings.atlas = "atlas".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.atlas]
    
    inline def avp2: typingsJapgolly.gamedig.gamedigStrings.avp2 = "avp2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.avp2]
    
    inline def avp2010: typingsJapgolly.gamedig.gamedigStrings.avp2010 = "avp2010".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.avp2010]
    
    inline def baldursgate: typingsJapgolly.gamedig.gamedigStrings.baldursgate = "baldursgate".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.baldursgate]
    
    inline def barotrauma: typingsJapgolly.gamedig.gamedigStrings.barotrauma = "barotrauma".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.barotrauma]
    
    inline def bat1944: typingsJapgolly.gamedig.gamedigStrings.bat1944 = "bat1944".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bat1944]
    
    inline def bf1942: typingsJapgolly.gamedig.gamedigStrings.bf1942 = "bf1942".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bf1942]
    
    inline def bf2: typingsJapgolly.gamedig.gamedigStrings.bf2 = "bf2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bf2]
    
    inline def bf2142: typingsJapgolly.gamedig.gamedigStrings.bf2142 = "bf2142".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bf2142]
    
    inline def bf3: typingsJapgolly.gamedig.gamedigStrings.bf3 = "bf3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bf3]
    
    inline def bf4: typingsJapgolly.gamedig.gamedigStrings.bf4 = "bf4".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bf4]
    
    inline def bfbc2: typingsJapgolly.gamedig.gamedigStrings.bfbc2 = "bfbc2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bfbc2]
    
    inline def bfh: typingsJapgolly.gamedig.gamedigStrings.bfh = "bfh".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bfh]
    
    inline def bfv: typingsJapgolly.gamedig.gamedigStrings.bfv = "bfv".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.bfv]
    
    inline def breach: typingsJapgolly.gamedig.gamedigStrings.breach = "breach".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.breach]
    
    inline def breed: typingsJapgolly.gamedig.gamedigStrings.breed = "breed".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.breed]
    
    inline def brink: typingsJapgolly.gamedig.gamedigStrings.brink = "brink".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.brink]
    
    inline def buildandshoot: typingsJapgolly.gamedig.gamedigStrings.buildandshoot = "buildandshoot".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.buildandshoot]
    
    inline def cacrenegade: typingsJapgolly.gamedig.gamedigStrings.cacrenegade = "cacrenegade".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cacrenegade]
    
    inline def callofjuarez: typingsJapgolly.gamedig.gamedigStrings.callofjuarez = "callofjuarez".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.callofjuarez]
    
    inline def chaser: typingsJapgolly.gamedig.gamedigStrings.chaser = "chaser".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.chaser]
    
    inline def chrome: typingsJapgolly.gamedig.gamedigStrings.chrome = "chrome".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.chrome]
    
    inline def cod: typingsJapgolly.gamedig.gamedigStrings.cod = "cod".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cod]
    
    inline def cod2: typingsJapgolly.gamedig.gamedigStrings.cod2 = "cod2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cod2]
    
    inline def cod3: typingsJapgolly.gamedig.gamedigStrings.cod3 = "cod3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cod3]
    
    inline def cod4: typingsJapgolly.gamedig.gamedigStrings.cod4 = "cod4".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cod4]
    
    inline def codenameeagle: typingsJapgolly.gamedig.gamedigStrings.codenameeagle = "codenameeagle".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.codenameeagle]
    
    inline def codmw2: typingsJapgolly.gamedig.gamedigStrings.codmw2 = "codmw2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.codmw2]
    
    inline def codmw3: typingsJapgolly.gamedig.gamedigStrings.codmw3 = "codmw3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.codmw3]
    
    inline def coduo: typingsJapgolly.gamedig.gamedigStrings.coduo = "coduo".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.coduo]
    
    inline def codwaw: typingsJapgolly.gamedig.gamedigStrings.codwaw = "codwaw".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.codwaw]
    
    inline def commandos3: typingsJapgolly.gamedig.gamedigStrings.commandos3 = "commandos3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.commandos3]
    
    inline def conanexiles: typingsJapgolly.gamedig.gamedigStrings.conanexiles = "conanexiles".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.conanexiles]
    
    inline def contactjack: typingsJapgolly.gamedig.gamedigStrings.contactjack = "contactjack".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.contactjack]
    
    inline def contagion: typingsJapgolly.gamedig.gamedigStrings.contagion = "contagion".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.contagion]
    
    inline def crossracing: typingsJapgolly.gamedig.gamedigStrings.crossracing = "crossracing".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.crossracing]
    
    inline def crysis: typingsJapgolly.gamedig.gamedigStrings.crysis = "crysis".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.crysis]
    
    inline def crysis2: typingsJapgolly.gamedig.gamedigStrings.crysis2 = "crysis2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.crysis2]
    
    inline def crysiswars: typingsJapgolly.gamedig.gamedigStrings.crysiswars = "crysiswars".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.crysiswars]
    
    inline def cs15: typingsJapgolly.gamedig.gamedigStrings.cs15 = "cs15".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cs15]
    
    inline def cs16: typingsJapgolly.gamedig.gamedigStrings.cs16 = "cs16".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cs16]
    
    inline def cs2d: typingsJapgolly.gamedig.gamedigStrings.cs2d = "cs2d".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cs2d]
    
    inline def cscz: typingsJapgolly.gamedig.gamedigStrings.cscz = "cscz".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.cscz]
    
    inline def csgo: typingsJapgolly.gamedig.gamedigStrings.csgo = "csgo".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.csgo]
    
    inline def css: typingsJapgolly.gamedig.gamedigStrings.css = "css".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.css]
    
    inline def daikatana: typingsJapgolly.gamedig.gamedigStrings.daikatana = "daikatana".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.daikatana]
    
    inline def darkesthour: typingsJapgolly.gamedig.gamedigStrings.darkesthour = "darkesthour".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.darkesthour]
    
    inline def daysofwar: typingsJapgolly.gamedig.gamedigStrings.daysofwar = "daysofwar".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.daysofwar]
    
    inline def dayz: typingsJapgolly.gamedig.gamedigStrings.dayz = "dayz".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dayz]
    
    inline def dayzmod: typingsJapgolly.gamedig.gamedigStrings.dayzmod = "dayzmod".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dayzmod]
    
    inline def deadlydozenpt: typingsJapgolly.gamedig.gamedigStrings.deadlydozenpt = "deadlydozenpt".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.deadlydozenpt]
    
    inline def descent3: typingsJapgolly.gamedig.gamedigStrings.descent3 = "descent3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.descent3]
    
    inline def deusex: typingsJapgolly.gamedig.gamedigStrings.deusex = "deusex".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.deusex]
    
    inline def devastation: typingsJapgolly.gamedig.gamedigStrings.devastation = "devastation".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.devastation]
    
    inline def dh2005: typingsJapgolly.gamedig.gamedigStrings.dh2005 = "dh2005".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dh2005]
    
    inline def dinodday: typingsJapgolly.gamedig.gamedigStrings.dinodday = "dinodday".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dinodday]
    
    inline def dirttrackracing2: typingsJapgolly.gamedig.gamedigStrings.dirttrackracing2 = "dirttrackracing2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dirttrackracing2]
    
    inline def discord: typingsJapgolly.gamedig.gamedigStrings.discord = "discord".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.discord]
    
    inline def dmomam: typingsJapgolly.gamedig.gamedigStrings.dmomam = "dmomam".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dmomam]
    
    inline def dnl: typingsJapgolly.gamedig.gamedigStrings.dnl = "dnl".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dnl]
    
    inline def dod: typingsJapgolly.gamedig.gamedigStrings.dod = "dod".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dod]
    
    inline def dods: typingsJapgolly.gamedig.gamedigStrings.dods = "dods".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dods]
    
    inline def doi: typingsJapgolly.gamedig.gamedigStrings.doi = "doi".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.doi]
    
    inline def doom3: typingsJapgolly.gamedig.gamedigStrings.doom3 = "doom3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.doom3]
    
    inline def dota2: typingsJapgolly.gamedig.gamedigStrings.dota2 = "dota2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.dota2]
    
    inline def drakan: typingsJapgolly.gamedig.gamedigStrings.drakan = "drakan".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.drakan]
    
    inline def empyrion: typingsJapgolly.gamedig.gamedigStrings.empyrion = "empyrion".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.empyrion]
    
    inline def etqw: typingsJapgolly.gamedig.gamedigStrings.etqw = "etqw".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.etqw]
    
    inline def f12002: typingsJapgolly.gamedig.gamedigStrings.f12002 = "f12002".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.f12002]
    
    inline def f1c9902: typingsJapgolly.gamedig.gamedigStrings.f1c9902 = "f1c9902".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.f1c9902]
    
    inline def farcry: typingsJapgolly.gamedig.gamedigStrings.farcry = "farcry".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.farcry]
    
    inline def farcry2: typingsJapgolly.gamedig.gamedigStrings.farcry2 = "farcry2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.farcry2]
    
    inline def fear: typingsJapgolly.gamedig.gamedigStrings.fear = "fear".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.fear]
    
    inline def ffow: typingsJapgolly.gamedig.gamedigStrings.ffow = "ffow".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ffow]
    
    inline def fivem: typingsJapgolly.gamedig.gamedigStrings.fivem = "fivem".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.fivem]
    
    inline def flashpoint: typingsJapgolly.gamedig.gamedigStrings.flashpoint = "flashpoint".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.flashpoint]
    
    inline def flashpointresistance: typingsJapgolly.gamedig.gamedigStrings.flashpointresistance = "flashpointresistance".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.flashpointresistance]
    
    inline def forrest: typingsJapgolly.gamedig.gamedigStrings.forrest = "forrest".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.forrest]
    
    inline def fortressforever: typingsJapgolly.gamedig.gamedigStrings.fortressforever = "fortressforever".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.fortressforever]
    
    inline def garrysmod: typingsJapgolly.gamedig.gamedigStrings.garrysmod = "garrysmod".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.garrysmod]
    
    inline def geneshift: typingsJapgolly.gamedig.gamedigStrings.geneshift = "geneshift".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.geneshift]
    
    inline def ges: typingsJapgolly.gamedig.gamedigStrings.ges = "ges".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ges]
    
    inline def giantscitizenkabuto: typingsJapgolly.gamedig.gamedigStrings.giantscitizenkabuto = "giantscitizenkabuto".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.giantscitizenkabuto]
    
    inline def globaloperations: typingsJapgolly.gamedig.gamedigStrings.globaloperations = "globaloperations".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.globaloperations]
    
    inline def gore: typingsJapgolly.gamedig.gamedigStrings.gore = "gore".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.gore]
    
    inline def graw: typingsJapgolly.gamedig.gamedigStrings.graw = "graw".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.graw]
    
    inline def graw2: typingsJapgolly.gamedig.gamedigStrings.graw2 = "graw2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.graw2]
    
    inline def groundbreach: typingsJapgolly.gamedig.gamedigStrings.groundbreach = "groundbreach".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.groundbreach]
    
    inline def gunmanchronicles: typingsJapgolly.gamedig.gamedigStrings.gunmanchronicles = "gunmanchronicles".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.gunmanchronicles]
    
    inline def had2: typingsJapgolly.gamedig.gamedigStrings.had2 = "had2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.had2]
    
    inline def halo: typingsJapgolly.gamedig.gamedigStrings.halo = "halo".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.halo]
    
    inline def halo2: typingsJapgolly.gamedig.gamedigStrings.halo2 = "halo2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.halo2]
    
    inline def heretic2: typingsJapgolly.gamedig.gamedigStrings.heretic2 = "heretic2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.heretic2]
    
    inline def hexen2: typingsJapgolly.gamedig.gamedigStrings.hexen2 = "hexen2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hexen2]
    
    inline def hidden: typingsJapgolly.gamedig.gamedigStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hidden]
    
    inline def hl2dm: typingsJapgolly.gamedig.gamedigStrings.hl2dm = "hl2dm".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hl2dm]
    
    inline def hldm: typingsJapgolly.gamedig.gamedigStrings.hldm = "hldm".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hldm]
    
    inline def hldms: typingsJapgolly.gamedig.gamedigStrings.hldms = "hldms".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hldms]
    
    inline def hll: typingsJapgolly.gamedig.gamedigStrings.hll = "hll".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hll]
    
    inline def homefront: typingsJapgolly.gamedig.gamedigStrings.homefront = "homefront".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.homefront]
    
    inline def homeworld2: typingsJapgolly.gamedig.gamedigStrings.homeworld2 = "homeworld2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.homeworld2]
    
    inline def hurtworld: typingsJapgolly.gamedig.gamedigStrings.hurtworld = "hurtworld".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.hurtworld]
    
    inline def igi2: typingsJapgolly.gamedig.gamedigStrings.igi2 = "igi2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.igi2]
    
    inline def il2: typingsJapgolly.gamedig.gamedigStrings.il2 = "il2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.il2]
    
    inline def insurgency: typingsJapgolly.gamedig.gamedigStrings.insurgency = "insurgency".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.insurgency]
    
    inline def insurgencysandstorm: typingsJapgolly.gamedig.gamedigStrings.insurgencysandstorm = "insurgencysandstorm".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.insurgencysandstorm]
    
    inline def ironstorm: typingsJapgolly.gamedig.gamedigStrings.ironstorm = "ironstorm".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ironstorm]
    
    inline def jamesbondnightfire: typingsJapgolly.gamedig.gamedigStrings.jamesbondnightfire = "jamesbondnightfire".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.jamesbondnightfire]
    
    inline def jc2mp: typingsJapgolly.gamedig.gamedigStrings.jc2mp = "jc2mp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.jc2mp]
    
    inline def jc3mp: typingsJapgolly.gamedig.gamedigStrings.jc3mp = "jc3mp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.jc3mp]
    
    inline def killingfloor: typingsJapgolly.gamedig.gamedigStrings.killingfloor = "killingfloor".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.killingfloor]
    
    inline def killingfloor2: typingsJapgolly.gamedig.gamedigStrings.killingfloor2 = "killingfloor2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.killingfloor2]
    
    inline def kingpin: typingsJapgolly.gamedig.gamedigStrings.kingpin = "kingpin".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.kingpin]
    
    inline def kisspc: typingsJapgolly.gamedig.gamedigStrings.kisspc = "kisspc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.kisspc]
    
    inline def kspdmp: typingsJapgolly.gamedig.gamedigStrings.kspdmp = "kspdmp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.kspdmp]
    
    inline def kzmod: typingsJapgolly.gamedig.gamedigStrings.kzmod = "kzmod".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.kzmod]
    
    inline def left4dead: typingsJapgolly.gamedig.gamedigStrings.left4dead = "left4dead".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.left4dead]
    
    inline def left4dead2: typingsJapgolly.gamedig.gamedigStrings.left4dead2 = "left4dead2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.left4dead2]
    
    inline def m2mp: typingsJapgolly.gamedig.gamedigStrings.m2mp = "m2mp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.m2mp]
    
    inline def m2o: typingsJapgolly.gamedig.gamedigStrings.m2o = "m2o".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.m2o]
    
    inline def medievalengineers: typingsJapgolly.gamedig.gamedigStrings.medievalengineers = "medievalengineers".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.medievalengineers]
    
    inline def minecraft: typingsJapgolly.gamedig.gamedigStrings.minecraft = "minecraft".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.minecraft]
    
    inline def minecraftbe: typingsJapgolly.gamedig.gamedigStrings.minecraftbe = "minecraftbe".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.minecraftbe]
    
    inline def minecraftpe: typingsJapgolly.gamedig.gamedigStrings.minecraftpe = "minecraftpe".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.minecraftpe]
    
    inline def minecraftping: typingsJapgolly.gamedig.gamedigStrings.minecraftping = "minecraftping".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.minecraftping]
    
    inline def mnc: typingsJapgolly.gamedig.gamedigStrings.mnc = "mnc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mnc]
    
    inline def moh2010: typingsJapgolly.gamedig.gamedigStrings.moh2010 = "moh2010".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.moh2010]
    
    inline def mohaa: typingsJapgolly.gamedig.gamedigStrings.mohaa = "mohaa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohaa]
    
    inline def mohab: typingsJapgolly.gamedig.gamedigStrings.mohab = "mohab".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohab]
    
    inline def mohbt: typingsJapgolly.gamedig.gamedigStrings.mohbt = "mohbt".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohbt]
    
    inline def mohpa: typingsJapgolly.gamedig.gamedigStrings.mohpa = "mohpa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohpa]
    
    inline def mohsh: typingsJapgolly.gamedig.gamedigStrings.mohsh = "mohsh".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohsh]
    
    inline def mohwf: typingsJapgolly.gamedig.gamedigStrings.mohwf = "mohwf".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mohwf]
    
    inline def mordhau: typingsJapgolly.gamedig.gamedigStrings.mordhau = "mordhau".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mordhau]
    
    inline def mtasa: typingsJapgolly.gamedig.gamedigStrings.mtasa = "mtasa".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mtasa]
    
    inline def mtavc: typingsJapgolly.gamedig.gamedigStrings.mtavc = "mtavc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mtavc]
    
    inline def mumble: typingsJapgolly.gamedig.gamedigStrings.mumble = "mumble".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mumble]
    
    inline def mumbleping: typingsJapgolly.gamedig.gamedigStrings.mumbleping = "mumbleping".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mumbleping]
    
    inline def mutantfactions: typingsJapgolly.gamedig.gamedigStrings.mutantfactions = "mutantfactions".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.mutantfactions]
    
    inline def nab: typingsJapgolly.gamedig.gamedigStrings.nab = "nab".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nab]
    
    inline def nascarthunder2004: typingsJapgolly.gamedig.gamedigStrings.nascarthunder2004 = "nascarthunder2004".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nascarthunder2004]
    
    inline def netpanzer: typingsJapgolly.gamedig.gamedigStrings.netpanzer = "netpanzer".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.netpanzer]
    
    inline def nexuiz: typingsJapgolly.gamedig.gamedigStrings.nexuiz = "nexuiz".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nexuiz]
    
    inline def nfshp2: typingsJapgolly.gamedig.gamedigStrings.nfshp2 = "nfshp2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nfshp2]
    
    inline def nitrofamily: typingsJapgolly.gamedig.gamedigStrings.nitrofamily = "nitrofamily".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nitrofamily]
    
    inline def nmrih: typingsJapgolly.gamedig.gamedigStrings.nmrih = "nmrih".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nmrih]
    
    inline def nolf: typingsJapgolly.gamedig.gamedigStrings.nolf = "nolf".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nolf]
    
    inline def nolf2: typingsJapgolly.gamedig.gamedigStrings.nolf2 = "nolf2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nolf2]
    
    inline def ns: typingsJapgolly.gamedig.gamedigStrings.ns = "ns".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ns]
    
    inline def ns2: typingsJapgolly.gamedig.gamedigStrings.ns2 = "ns2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ns2]
    
    inline def nucleardawn: typingsJapgolly.gamedig.gamedigStrings.nucleardawn = "nucleardawn".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nucleardawn]
    
    inline def nwn: typingsJapgolly.gamedig.gamedigStrings.nwn = "nwn".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nwn]
    
    inline def nwn2: typingsJapgolly.gamedig.gamedigStrings.nwn2 = "nwn2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.nwn2]
    
    inline def openarena: typingsJapgolly.gamedig.gamedigStrings.openarena = "openarena".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.openarena]
    
    inline def openttd: typingsJapgolly.gamedig.gamedigStrings.openttd = "openttd".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.openttd]
    
    inline def operationflashpoint: typingsJapgolly.gamedig.gamedigStrings.operationflashpoint = "operationflashpoint".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.operationflashpoint]
    
    inline def painkiller: typingsJapgolly.gamedig.gamedigStrings.painkiller = "painkiller".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.painkiller]
    
    inline def pixark: typingsJapgolly.gamedig.gamedigStrings.pixark = "pixark".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.pixark]
    
    inline def postal2: typingsJapgolly.gamedig.gamedigStrings.postal2 = "postal2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.postal2]
    
    inline def prbf2: typingsJapgolly.gamedig.gamedigStrings.prbf2 = "prbf2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.prbf2]
    
    inline def prey: typingsJapgolly.gamedig.gamedigStrings.prey = "prey".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.prey]
    
    inline def primalcarnage: typingsJapgolly.gamedig.gamedigStrings.primalcarnage = "primalcarnage".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.primalcarnage]
    
    inline def przomboid: typingsJapgolly.gamedig.gamedigStrings.przomboid = "przomboid".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.przomboid]
    
    inline def ps: typingsJapgolly.gamedig.gamedigStrings.ps = "ps".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ps]
    
    inline def quake1: typingsJapgolly.gamedig.gamedigStrings.quake1 = "quake1".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.quake1]
    
    inline def quake2: typingsJapgolly.gamedig.gamedigStrings.quake2 = "quake2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.quake2]
    
    inline def quake3: typingsJapgolly.gamedig.gamedigStrings.quake3 = "quake3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.quake3]
    
    inline def quake4: typingsJapgolly.gamedig.gamedigStrings.quake4 = "quake4".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.quake4]
    
    inline def quakelive: typingsJapgolly.gamedig.gamedigStrings.quakelive = "quakelive".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.quakelive]
    
    inline def r6: typingsJapgolly.gamedig.gamedigStrings.r6 = "r6".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.r6]
    
    inline def r6ravenshield: typingsJapgolly.gamedig.gamedigStrings.r6ravenshield = "r6ravenshield".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.r6ravenshield]
    
    inline def r6roguespear: typingsJapgolly.gamedig.gamedigStrings.r6roguespear = "r6roguespear".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.r6roguespear]
    
    inline def ragdollkungfu: typingsJapgolly.gamedig.gamedigStrings.ragdollkungfu = "ragdollkungfu".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ragdollkungfu]
    
    inline def rallisportchallenge: typingsJapgolly.gamedig.gamedigStrings.rallisportchallenge = "rallisportchallenge".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rallisportchallenge]
    
    inline def rallymasters: typingsJapgolly.gamedig.gamedigStrings.rallymasters = "rallymasters".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rallymasters]
    
    inline def redline: typingsJapgolly.gamedig.gamedigStrings.redline = "redline".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.redline]
    
    inline def redorchestra: typingsJapgolly.gamedig.gamedigStrings.redorchestra = "redorchestra".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.redorchestra]
    
    inline def redorchestra2: typingsJapgolly.gamedig.gamedigStrings.redorchestra2 = "redorchestra2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.redorchestra2]
    
    inline def redorchestraost: typingsJapgolly.gamedig.gamedigStrings.redorchestraost = "redorchestraost".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.redorchestraost]
    
    inline def rfactor: typingsJapgolly.gamedig.gamedigStrings.rfactor = "rfactor".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rfactor]
    
    inline def ricochet: typingsJapgolly.gamedig.gamedigStrings.ricochet = "ricochet".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ricochet]
    
    inline def riseofnations: typingsJapgolly.gamedig.gamedigStrings.riseofnations = "riseofnations".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.riseofnations]
    
    inline def rs2: typingsJapgolly.gamedig.gamedigStrings.rs2 = "rs2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rs2]
    
    inline def rtcw: typingsJapgolly.gamedig.gamedigStrings.rtcw = "rtcw".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rtcw]
    
    inline def rune: typingsJapgolly.gamedig.gamedigStrings.rune = "rune".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rune]
    
    inline def rust: typingsJapgolly.gamedig.gamedigStrings.rust = "rust".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.rust]
    
    inline def samp: typingsJapgolly.gamedig.gamedigStrings.samp = "samp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.samp]
    
    inline def savage2: typingsJapgolly.gamedig.gamedigStrings.savage2 = "savage2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.savage2]
    
    inline def shatteredhorizon: typingsJapgolly.gamedig.gamedigStrings.shatteredhorizon = "shatteredhorizon".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.shatteredhorizon]
    
    inline def ship: typingsJapgolly.gamedig.gamedigStrings.ship = "ship".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ship]
    
    inline def shogo: typingsJapgolly.gamedig.gamedigStrings.shogo = "shogo".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.shogo]
    
    inline def shootmania: typingsJapgolly.gamedig.gamedigStrings.shootmania = "shootmania".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.shootmania]
    
    inline def sin: typingsJapgolly.gamedig.gamedigStrings.sin = "sin".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.sin]
    
    inline def sinep: typingsJapgolly.gamedig.gamedigStrings.sinep = "sinep".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.sinep]
    
    inline def sof: typingsJapgolly.gamedig.gamedigStrings.sof = "sof".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.sof]
    
    inline def sof2: typingsJapgolly.gamedig.gamedigStrings.sof2 = "sof2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.sof2]
    
    inline def soldat: typingsJapgolly.gamedig.gamedigStrings.soldat = "soldat".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.soldat]
    
    inline def spaceengineers: typingsJapgolly.gamedig.gamedigStrings.spaceengineers = "spaceengineers".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.spaceengineers]
    
    inline def squad: typingsJapgolly.gamedig.gamedigStrings.squad = "squad".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.squad]
    
    inline def ss: typingsJapgolly.gamedig.gamedigStrings.ss = "ss".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ss]
    
    inline def ss2: typingsJapgolly.gamedig.gamedigStrings.ss2 = "ss2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ss2]
    
    inline def stalker: typingsJapgolly.gamedig.gamedigStrings.stalker = "stalker".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.stalker]
    
    inline def starbound: typingsJapgolly.gamedig.gamedigStrings.starbound = "starbound".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.starbound]
    
    inline def starmade: typingsJapgolly.gamedig.gamedigStrings.starmade = "starmade".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.starmade]
    
    inline def starsiege: typingsJapgolly.gamedig.gamedigStrings.starsiege = "starsiege".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.starsiege]
    
    inline def stbc: typingsJapgolly.gamedig.gamedigStrings.stbc = "stbc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.stbc]
    
    inline def stvef: typingsJapgolly.gamedig.gamedigStrings.stvef = "stvef".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.stvef]
    
    inline def stvef2: typingsJapgolly.gamedig.gamedigStrings.stvef2 = "stvef2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.stvef2]
    
    inline def suicidesurvival: typingsJapgolly.gamedig.gamedigStrings.suicidesurvival = "suicidesurvival".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.suicidesurvival]
    
    inline def svencoop: typingsJapgolly.gamedig.gamedigStrings.svencoop = "svencoop".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.svencoop]
    
    inline def swat4: typingsJapgolly.gamedig.gamedigStrings.swat4 = "swat4".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swat4]
    
    inline def swbf: typingsJapgolly.gamedig.gamedigStrings.swbf = "swbf".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swbf]
    
    inline def swbf2: typingsJapgolly.gamedig.gamedigStrings.swbf2 = "swbf2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swbf2]
    
    inline def swjk: typingsJapgolly.gamedig.gamedigStrings.swjk = "swjk".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swjk]
    
    inline def swjk2: typingsJapgolly.gamedig.gamedigStrings.swjk2 = "swjk2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swjk2]
    
    inline def swrc: typingsJapgolly.gamedig.gamedigStrings.swrc = "swrc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.swrc]
    
    inline def synergy: typingsJapgolly.gamedig.gamedigStrings.synergy = "synergy".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.synergy]
    
    inline def tacticalops: typingsJapgolly.gamedig.gamedigStrings.tacticalops = "tacticalops".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tacticalops]
    
    inline def takeonhelicopters: typingsJapgolly.gamedig.gamedigStrings.takeonhelicopters = "takeonhelicopters".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.takeonhelicopters]
    
    inline def teamfactor: typingsJapgolly.gamedig.gamedigStrings.teamfactor = "teamfactor".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.teamfactor]
    
    inline def teamspeak2: typingsJapgolly.gamedig.gamedigStrings.teamspeak2 = "teamspeak2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.teamspeak2]
    
    inline def teamspeak3: typingsJapgolly.gamedig.gamedigStrings.teamspeak3 = "teamspeak3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.teamspeak3]
    
    inline def terminus: typingsJapgolly.gamedig.gamedigStrings.terminus = "terminus".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.terminus]
    
    inline def terraria: typingsJapgolly.gamedig.gamedigStrings.terraria = "terraria".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.terraria]
    
    inline def tf2: typingsJapgolly.gamedig.gamedigStrings.tf2 = "tf2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tf2]
    
    inline def tfc: typingsJapgolly.gamedig.gamedigStrings.tfc = "tfc".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tfc]
    
    inline def thps3: typingsJapgolly.gamedig.gamedigStrings.thps3 = "thps3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.thps3]
    
    inline def thps4: typingsJapgolly.gamedig.gamedigStrings.thps4 = "thps4".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.thps4]
    
    inline def thu2: typingsJapgolly.gamedig.gamedigStrings.thu2 = "thu2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.thu2]
    
    inline def towerunite: typingsJapgolly.gamedig.gamedigStrings.towerunite = "towerunite".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.towerunite]
    
    inline def trackmania2: typingsJapgolly.gamedig.gamedigStrings.trackmania2 = "trackmania2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.trackmania2]
    
    inline def trackmaniaforever: typingsJapgolly.gamedig.gamedigStrings.trackmaniaforever = "trackmaniaforever".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.trackmaniaforever]
    
    inline def tremulous: typingsJapgolly.gamedig.gamedigStrings.tremulous = "tremulous".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tremulous]
    
    inline def tribes1: typingsJapgolly.gamedig.gamedigStrings.tribes1 = "tribes1".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tribes1]
    
    inline def tribesvengeance: typingsJapgolly.gamedig.gamedigStrings.tribesvengeance = "tribesvengeance".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tribesvengeance]
    
    inline def tron20: typingsJapgolly.gamedig.gamedigStrings.tron20 = "tron20".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tron20]
    
    inline def tshock: typingsJapgolly.gamedig.gamedigStrings.tshock = "tshock".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.tshock]
    
    inline def turok2: typingsJapgolly.gamedig.gamedigStrings.turok2 = "turok2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.turok2]
    
    inline def universalcombat: typingsJapgolly.gamedig.gamedigStrings.universalcombat = "universalcombat".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.universalcombat]
    
    inline def unreal: typingsJapgolly.gamedig.gamedigStrings.unreal = "unreal".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.unreal]
    
    inline def unturned: typingsJapgolly.gamedig.gamedigStrings.unturned = "unturned".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.unturned]
    
    inline def urbanterror: typingsJapgolly.gamedig.gamedigStrings.urbanterror = "urbanterror".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.urbanterror]
    
    inline def ut: typingsJapgolly.gamedig.gamedigStrings.ut = "ut".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ut]
    
    inline def ut2003: typingsJapgolly.gamedig.gamedigStrings.ut2003 = "ut2003".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ut2003]
    
    inline def ut2004: typingsJapgolly.gamedig.gamedigStrings.ut2004 = "ut2004".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ut2004]
    
    inline def ut3: typingsJapgolly.gamedig.gamedigStrings.ut3 = "ut3".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ut3]
    
    inline def v8supercar: typingsJapgolly.gamedig.gamedigStrings.v8supercar = "v8supercar".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.v8supercar]
    
    inline def valheim: typingsJapgolly.gamedig.gamedigStrings.valheim = "valheim".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.valheim]
    
    inline def vcmp: typingsJapgolly.gamedig.gamedigStrings.vcmp = "vcmp".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.vcmp]
    
    inline def ventrilo: typingsJapgolly.gamedig.gamedigStrings.ventrilo = "ventrilo".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.ventrilo]
    
    inline def vietcong: typingsJapgolly.gamedig.gamedigStrings.vietcong = "vietcong".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.vietcong]
    
    inline def vietcong2: typingsJapgolly.gamedig.gamedigStrings.vietcong2 = "vietcong2".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.vietcong2]
    
    inline def warsow: typingsJapgolly.gamedig.gamedigStrings.warsow = "warsow".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.warsow]
    
    inline def wheeloftime: typingsJapgolly.gamedig.gamedigStrings.wheeloftime = "wheeloftime".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.wheeloftime]
    
    inline def wolfenstein2009: typingsJapgolly.gamedig.gamedigStrings.wolfenstein2009 = "wolfenstein2009".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.wolfenstein2009]
    
    inline def wolfensteinet: typingsJapgolly.gamedig.gamedigStrings.wolfensteinet = "wolfensteinet".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.wolfensteinet]
    
    inline def xpandrally: typingsJapgolly.gamedig.gamedigStrings.xpandrally = "xpandrally".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.xpandrally]
    
    inline def zombiemaster: typingsJapgolly.gamedig.gamedigStrings.zombiemaster = "zombiemaster".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.zombiemaster]
    
    inline def zps: typingsJapgolly.gamedig.gamedigStrings.zps = "zps".asInstanceOf[typingsJapgolly.gamedig.gamedigStrings.zps]
  }
}
